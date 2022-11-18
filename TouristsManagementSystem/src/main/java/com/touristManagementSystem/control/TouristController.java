package com.touristManagementSystem.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.touristManagementSystem.model.TouristContact;
import com.touristManagementSystem.model.TouristMaster;
import com.touristManagementSystem.service.ContactService;
import com.touristManagementSystem.service.TouristService;

@RestController
public class TouristController {

	@Autowired
	TouristService touristService;

	@Autowired
	ContactService contactService;

	@GetMapping(value = "/index")
	public ModelAndView addNewTourist() {
		ModelAndView mv = new ModelAndView("AddNewTourist");
		return mv;
	}

	@PostMapping("/saveTourist")
	public ModelAndView saveTourist(@RequestParam("touristName") String touristName,
			@RequestParam("address") String address, @RequestParam("tourDate") String tourDate,
			@RequestParam("bookingAmount") Float bookingAmount, @RequestParam("phoneNumber1") String phoneNumber1,
			@RequestParam("phoneNumber2") String phoneNumber2, @RequestParam("phoneNumber3") String phoneNumber3) {
		
		ModelAndView mv = new ModelAndView("TouristDetails");

		TouristMaster touristMaster = new TouristMaster();
		TouristContact touristContact = new TouristContact();
		TouristContact touristContact2 = new TouristContact();
		TouristContact touristContact3 = new TouristContact();

		System.out.println(touristMaster.getTouristId());
		touristMaster.setTouristName(touristName);
		touristMaster.setAddress(address);
		touristMaster.setTourDate(tourDate);
		touristMaster.setBookingAmount(bookingAmount);
		touristContact.setContactNumber(phoneNumber1);
		touristMaster.addPhoneNumbers(touristContact);

		if (!phoneNumber2.equals("0")) {
			touristContact2.setContactNumber(phoneNumber2);
			touristContact2.setTouristMaster(touristMaster);
			touristMaster.addPhoneNumbers(touristContact2);
		}
		if (!phoneNumber3.equals("0")) {

			touristContact3.setContactNumber(phoneNumber3);
			touristContact3.setTouristMaster(touristMaster);
			touristMaster.addPhoneNumbers(touristContact3);
		}

		touristService.saveData(touristMaster);
		contactService.addContactNumber(touristContact);
		contactService.addContactNumber(touristContact2);
		contactService.addContactNumber(touristContact3);
		
		mv.addObject("touristContact", touristContact);
		mv.addObject("touristContact2", touristContact2);
		mv.addObject("touristContact3", touristContact3);
		mv.addObject("tourist", touristMaster);
		return mv;
	}

}
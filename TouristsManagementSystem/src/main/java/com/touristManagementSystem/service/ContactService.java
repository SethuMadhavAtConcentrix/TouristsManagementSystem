package com.touristManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.touristManagementSystem.dbconnect.ContactRepository;
import com.touristManagementSystem.model.TouristContact;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	
	public void addContactNumber(TouristContact touristContact) {
		contactRepository.save(touristContact);
	}
}

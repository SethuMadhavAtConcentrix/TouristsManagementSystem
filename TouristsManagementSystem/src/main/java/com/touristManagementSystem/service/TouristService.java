package com.touristManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.touristManagementSystem.dbconnect.TouristRepository;
import com.touristManagementSystem.model.TouristMaster;

@Service
public class TouristService {
	
	@Autowired
	public TouristService(TouristRepository touristRepository) {
		super();
		this.touristRepository = touristRepository;
	}

	@Autowired
	private TouristRepository touristRepository;
	
	
	
	public List<TouristMaster> getData() {
		return touristRepository.findAll();
	}
	
	public void saveData(TouristMaster touristMaster) {
		touristRepository.save(touristMaster);
	}

}

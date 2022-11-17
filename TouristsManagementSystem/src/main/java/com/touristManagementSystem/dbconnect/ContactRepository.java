package com.touristManagementSystem.dbconnect;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.touristManagementSystem.model.TouristContact;

@Repository
public interface ContactRepository extends JpaRepository<TouristContact, String>{
	
}

package com.touristManagementSystem.dbconnect;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.touristManagementSystem.model.TouristMaster;

@Repository
public interface TouristRepository extends JpaRepository<TouristMaster, Integer>{
	
	
}

package com.touristManagementSystem.model;

import javax.persistence.*;

@Entity
@Table(name="tourist_contact")
public class TouristContact {
	
	@Id
    @Column(name="phone_number")
	private String contactNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="tourist_id")
	private TouristMaster touristMaster;
	
	public TouristContact() {
		super();
	}

	public TouristContact(String contactNumber, TouristMaster touristMaster) {
		super();
		this.contactNumber = contactNumber;
		this.touristMaster = touristMaster;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public TouristMaster getTouristMaster() {
		return touristMaster;
	}

	public void setTouristMaster(TouristMaster touristMaster) {
		this.touristMaster = touristMaster;
	}

	@Override
	public String toString() {
		return "TouristContact [contactNumber=" + contactNumber + ", touristMaster=" + touristMaster + "]";
	}
	
}

package com.touristManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tourist_contact")
public class TouristContact {
	
	private Integer touristId;
	private Integer contact1;
	private Integer contact2;
	private Integer contact3;
	
	public TouristContact() {
		super();
	}

	public TouristContact(Integer touristId, int contact1, int contact2, int contact3) {
		super();
		this.touristId = touristId;
		this.contact1 = contact1;
		this.contact2 = contact2;
		this.contact3 = contact3;
	}

	public int getTouristId() {
		return touristId;
	}

	public void setTouristId(int touristId) {
		this.touristId = touristId;
	}

	public int getContact1() {
		return contact1;
	}

	public void setContact1(int contact1) {
		this.contact1 = contact1;
	}

	public int getContact2() {
		return contact2;
	}

	public void setContact2(int contact2) {
		this.contact2 = contact2;
	}

	public int getContact3() {
		return contact3;
	}

	public void setContact3(int contact3) {
		this.contact3 = contact3;
	}

	@Override
	public String toString() {
		return "TouristContact [touristId=" + touristId + ", contact1=" + contact1 + ", contact2=" + contact2
				+ ", contact3=" + contact3 + "]";
	}
	
}
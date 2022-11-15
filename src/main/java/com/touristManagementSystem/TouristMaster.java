package com.touristManagementSystem.model;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "tourist_master")
public class TouristMaster {

	private int touristId;
	private String touristName;
	private String address;
	private String tourDate;
	private float bookingAmount;
	
	public TouristMaster() {
		super();
	}

	public TouristMaster(int touristId, String touristName, String address, String tourDate, float bookingAmount) {
		super();
		this.touristId = touristId;
		this.touristName = touristName;
		this.address = address;
		this.tourDate = tourDate;
		this.bookingAmount = bookingAmount;
	}

	public int getTouristId() {
		return touristId;
	}

	public void setTouristId(int touristId) {
		this.touristId = touristId;
	}

	public String getTouristName() {
		return touristName;
	}

	public void setTouristName(String touristName) {
		this.touristName = touristName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTourDate() {
		return tourDate;
	}

	public void setTourDate(String tourDate) {
		this.tourDate = tourDate;
	}

	public float getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(float bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	@Override
	public String toString() {
		return "TouristMaster [touristId=" + touristId + ", touristName=" + touristName + ", address=" + address
				+ ", tourDate=" + tourDate + ", bookingAmount=" + bookingAmount + "]";
	}

}


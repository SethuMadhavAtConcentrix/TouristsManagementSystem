package com.touristManagementSystem.model;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tourist_master")
public class TouristMaster {
    @Id
    @GeneratedValue(generator="sequence",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="sequence",initialValue=1000,allocationSize=1)
    @Column(name="tourist_id")
	private Integer touristId;
    
    @Column(name="tourist_name")
	private String touristName;
    
    @Column(name="address")
	private String address;
    
    @Column(name="tour_date")
	private String tourDate;
    
    @Column(name="booking_amount")
	private Float bookingAmount;
    
    @OneToMany(mappedBy = "touristMaster", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TouristContact> phoneNumbers = new ArrayList<>();
    
    public void addPhoneNumbers(TouristContact touristContact){
    	phoneNumbers.add(touristContact);
    	touristContact.setTouristMaster(this);
    }
    
    public List<TouristContact> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<TouristContact> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public TouristMaster() {
		super();
	}

	public TouristMaster(String touristName, String address, String tourDate, Float bookingAmount) {
		super();
		this.touristName = touristName;
		this.address = address;
		this.tourDate = tourDate;
		this.bookingAmount = bookingAmount;
	}

	public Integer getTouristId() {
		return touristId;
	}

	public void setTouristId(Integer touristId) {
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

	public Float getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(Float bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	@Override
	public String toString() {
		return "TouristMaster [touristId=" + touristId + ", touristName=" + touristName + ", address=" + address
				+ ", tourDate=" + tourDate + ", bookingAmount=" + bookingAmount + ", phoneNumbers=" + phoneNumbers
				+ "]";
	}
	
}

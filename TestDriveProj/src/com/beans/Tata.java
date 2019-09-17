package com.beans;

public class Tata {
	
	private int bookingID;
	private String customerName;
	private String licenseNo;
	private String vehicleMake;
	private String Date;
	
	public Tata() {}
	
	public Tata(int bookingID, String customerName, String licenseNo, String vehicleMake, String date) {
		super();
		this.bookingID = bookingID;
		this.customerName = customerName;
		this.licenseNo = licenseNo;
		this.vehicleMake = vehicleMake;
		Date = date;
	}
	
	
	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	
	
	

}

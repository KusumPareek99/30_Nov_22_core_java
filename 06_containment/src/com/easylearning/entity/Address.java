package com.easylearning.entity;

public class Address {
	private String city;
	private int pinCode;

	public Address(String city, int pinCode) {
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public String toString() {
		return "city= "+city+"   Pincode="+pinCode;
	}
	
	public void finalize() {
		System.out.println(this+" Alvida!!!!!");
	}

}

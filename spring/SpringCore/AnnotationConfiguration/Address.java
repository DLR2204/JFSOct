package com;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	
	private int hno;
	
	private String StreetName;
	
	private int pincode;
	
	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", StreetName=" + StreetName + ", pincode=" + pincode + ", city=" + city + "]";
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(int hno, String streetName, int pincode, String city) {
		super();
		this.hno = hno;
		StreetName = streetName;
		this.pincode = pincode;
		this.city = city;
	}
	
	

}

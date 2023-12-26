package com.workers.payloadrequest;

public class AddressRequest {

	private String add_Id;
	private String state;
	private String zip;
	private String street;
	private String city;
	private String country;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAdd_Id() {
		return add_Id;
	}

	public void setAdd_Id(String add_Id) {
		this.add_Id = add_Id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	
}

package com.workers.payloadrequest;

public class Person {
	private String name;
    private int age;
    private AddressRequest addressRequest;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AddressRequest getAddressRequest() {
		return addressRequest;
	}
	public void setAddressRequest(AddressRequest addressRequest) {
		this.addressRequest = addressRequest;
	}
	
    

}

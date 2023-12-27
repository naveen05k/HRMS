package com.workers.payloadrequest;

import java.time.LocalTime;
import java.util.Date;

public class EmployeeRequest {
	private String empId;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String phoneNumber;
	private String add;
	private Date dateOfBirth;
	private Date hireDate;
	private int salary;
	private String department;
	private Long managerId;
	private LocalTime updated_at;
	private LocalTime created_at;
	private byte[] empImage;
	private AddressRequest addressmodel;
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public LocalTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalTime updated_at) {
		this.updated_at = updated_at;
	}

	public LocalTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalTime created_at) {
		this.created_at = created_at;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public AddressRequest getAddressmodel() {
		return addressmodel;
	}

	public void setAddressmodel(AddressRequest addressmodel) {
		this.addressmodel = addressmodel;
	}

	public byte[] getEmpImage() {
		return empImage;
	}

	public void setEmpImage(byte[] empImage) {
		this.empImage = empImage;
	}
	

	
	
	

	// Constructors, getters, setters

}

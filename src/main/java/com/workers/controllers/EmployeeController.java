package com.workers.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workers.models.Address;
import com.workers.models.Employees;
import com.workers.payloadrequest.EmployeeRequest;
import com.workers.repository.EmployeeRepository;
import com.workers.response.MessageResponse;

import jakarta.servlet.http.HttpServletRequest;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@PostMapping("/saveEmployee")
	public ResponseEntity<MessageResponse> saveEmployee(@RequestBody EmployeeRequest req) {
		MessageResponse res = new MessageResponse();
		Employees emp = new Employees();
		try {
			emp.setFirstName(req.getFirstName());
			emp.setLastName(req.getLastName());
			emp.setEmail(req.getEmail());
			emp.setGender(req.getGender());
			emp.setPhoneNumber(req.getPhoneNumber());
			emp.setDateOfBirth(req.getDateOfBirth());
			emp.setHireDate(req.getHireDate());
			emp.setSalary(req.getSalary());
			emp.setDepartment(req.getDepartment());
			emp.setManagerId(req.getManagerId());
			emp.setCreated_at(new java.util.Date());
			emp.setUpdated_at(new java.util.Date());
			emp.setEmpImage(req.getEmpImage());

			Address ad = new Address();
			ad.setCity(req.getAddressmodel().getCity());
			ad.setState(req.getAddressmodel().getState());
			ad.setStreet(req.getAddressmodel().getStreet());
			ad.setCountry(req.getAddressmodel().getCountry());
			ad.setZip(req.getAddressmodel().getZip());
			emp.setAddress(ad);

			employeeRepository.save(emp);

			res.setStatus(true);
			res.setMessage("Employee created successfully with ID : " + emp.getEmpId());
			res.setData(emp);
			return ResponseEntity.status(HttpStatus.CREATED).body(res);
		} catch (Exception e) {
			res.setStatus(false);
			res.setMessage("Failed to create Employee" + e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(res);
		}
	}

	@GetMapping("/getAllEmployee")
	public MessageResponse getAllEmployeeDetails() {
		MessageResponse res = new MessageResponse();
		List<Employees> data = employeeRepository.findAll();
		if (data.size() > 0) {
			res.setStatus(true);
			res.setMessage("Fetched Data");
			res.setData(data);
		} else {
			res.setStatus(false);
			res.setMessage("Fetched Data");
			res.setData(data);
		}
		return res;
	}

	@GetMapping("/currentip")
	public String getClientIP(HttpServletRequest request) {
		String ipAddress = null;
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			ipAddress = localhost.getHostAddress();
			System.out.println("System IP Address: " + ipAddress);
		} catch (UnknownHostException e) {
			System.out.println("Unable to retrieve system IP address: " + e.getMessage());
		}
		return ipAddress;

	}
	
	

   
}

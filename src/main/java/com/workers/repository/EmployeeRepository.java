package com.workers.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workers.models.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, BigInteger>{

	

}

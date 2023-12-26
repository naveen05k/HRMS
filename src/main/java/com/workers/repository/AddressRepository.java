package com.workers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workers.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}

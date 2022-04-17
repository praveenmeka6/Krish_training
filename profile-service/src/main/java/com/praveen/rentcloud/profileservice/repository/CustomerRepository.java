package com.praveen.rentcloud.profileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.rentcloud.commons.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

package com.praveen.rentcloud.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.rentcloud.model.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}

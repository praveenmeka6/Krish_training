package com.praveen.rentcloud.customerservice.service;

import java.util.List;

import com.praveen.rentcloud.model.customer.Customer;

public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}

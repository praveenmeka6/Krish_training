package com.praveen.rentcloud.profileservice.service;

import java.util.List;

import com.praveen.rentcloud.commons.model.Customer;

public interface CustomerService {

	Customer save(Customer customer);

	Customer fetchById(int profileId);

	List<Customer> fetchAllProfiles();
}

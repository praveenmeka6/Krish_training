package com.praveen.rentcloud.profileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.praveen.rentcloud.commons.model.Customer;
import com.praveen.rentcloud.profileservice.service.CustomerService;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/customers",method = RequestMethod.POST)
	@PreAuthorize("hasAuthority('create_profile')")
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);	
	}

	@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
    public Customer fetch(@PathVariable(value = "id") int customerId) {
        return customerService.fetchById(customerId);
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_admin')")
    public List<Customer> fetch() {
        return customerService.fetchAllProfiles();
    }

}

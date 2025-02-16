package com.launcher.com.MongoDBLauncher1.service;

import java.util.List;

import com.launcher.com.MongoDBLauncher1.customerDTO.CustomerDto;
import com.launcher.com.MongoDBLauncher1.model.Customer;


public interface ICustomerService {
	public String registerCustomer(CustomerDto customerDto);
	
	public List<Customer> findAll();
}

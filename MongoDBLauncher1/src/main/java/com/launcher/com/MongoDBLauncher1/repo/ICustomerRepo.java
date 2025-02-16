package com.launcher.com.MongoDBLauncher1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.launcher.com.MongoDBLauncher1.model.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {
	
	

}

package com.launcher.com.MongoDBLauncher1.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.launcher.com.MongoDBLauncher1.customerDTO.CustomerDto;
import com.launcher.com.MongoDBLauncher1.model.Customer;
import com.launcher.com.MongoDBLauncher1.repo.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	ICustomerRepo iCustomerRepo;

	@Override
	public String registerCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		BeanUtils.copyProperties(customerDto, customer);
		
		System.out.println(customer);
		
		Customer savedObject =iCustomerRepo.save(customer);
		return "Saved sucessfully, Id is" + savedObject.getId();
		

	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return iCustomerRepo.findAll();
	}

}

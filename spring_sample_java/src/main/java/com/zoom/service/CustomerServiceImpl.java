package com.zoom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.zoom.model.Customer;
import com.zoom.repository.CustomerRepository;

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {

	
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
		System.out.println("inside default CustomerServiceImpl constructor");

	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("WebEndpoint are using constructor injection");
		this.customerRepository = customerRepository; 
	}
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("WebEndpoint are using setter injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll(){
		System.out.println("inside Service List class");
		return customerRepository.findAll();
	}
}

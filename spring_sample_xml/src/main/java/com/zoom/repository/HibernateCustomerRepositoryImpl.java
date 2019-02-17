package com.zoom.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.zoom.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	//comment below to use annotation @Value instead of hard calling
	//public void setDbUsername(String dbUsername) {
	//	this.dbUsername = dbUsername;
	//}

	@Override
	public List<Customer> findAll() {
		
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Sun");
		customer.setLastname("Stars");
		
		customers.add(customer);
		
		return customers;
	}
}

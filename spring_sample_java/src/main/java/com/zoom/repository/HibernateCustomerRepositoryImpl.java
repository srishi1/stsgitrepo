package com.zoom.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.zoom.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);
		
			System.out.println("inside Repository List class at step1");
		
		List<Customer> customers = new ArrayList<>();
		
			System.out.println("inside Repository List class at step2");
		
		Customer customer = new Customer();
		
			System.out.println("inside Repository List class at step3");	
		
		customer.setFirstname("Sun");
		
			System.out.println("inside Repository List class at step3");
		
		customer.setLastname("Stars");
		
			System.out.println("inside Repository List class at step4");
		
		customers.add(customer);
		
			System.out.println("inside Repository List class at step5");
		
		return customers;
	}
}

package com.zoom.repository;

import java.util.ArrayList;
import java.util.List;

import com.zoom.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.zoom.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Sun");
		customer.setLastname("Stars");
		
		customers.add(customer);
		
		return customers;
	}
}

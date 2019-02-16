package com.zoom.repository;

import java.util.List;

import com.zoom.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
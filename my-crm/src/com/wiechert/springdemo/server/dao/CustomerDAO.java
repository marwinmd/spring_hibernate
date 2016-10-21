package com.wiechert.springdemo.server.dao;

import java.util.List;

import com.wiechert.springdemo.server.domain.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
}

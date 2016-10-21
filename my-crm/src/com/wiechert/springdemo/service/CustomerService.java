package com.wiechert.springdemo.service;

import java.util.List;

import com.wiechert.springdemo.server.domain.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
}

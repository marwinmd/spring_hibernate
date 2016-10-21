package com.wiechert.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wiechert.springdemo.server.domain.Customer;
import com.wiechert.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject the customer service
	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listCustomers(Model model) {
		// adding the returned customers to the model of the application.
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		// where to go next
		return "list-customers";
	}
}

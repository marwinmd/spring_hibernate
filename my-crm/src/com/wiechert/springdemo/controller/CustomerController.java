package com.wiechert.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wiechert.springdemo.server.dao.CustomerDAO;
import com.wiechert.springdemo.server.domain.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// inject the dao into this controller
	@Autowired
	private CustomerDAO customerDao;

	@RequestMapping("/list")
	public String listCustomers(Model model) {
		// adding the returned customers to the model of the application.
		List<Customer> customers = customerDao.getCustomers();
		model.addAttribute("customers", customers);
		// where to go next
		return "list-customers";
	}
}

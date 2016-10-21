package com.wiechert.springdemo.server.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wiechert.springdemo.server.domain.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {

		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> createQuery = currentSession.createQuery("from Customer", Customer.class);
		List<Customer> resultList = createQuery.getResultList();
		for (Customer customer : resultList) {
			System.out.println(customer);
		}
		return resultList;
	}

}

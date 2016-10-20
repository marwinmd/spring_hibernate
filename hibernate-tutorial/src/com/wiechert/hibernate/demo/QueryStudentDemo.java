package com.wiechert.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wiechert.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			List<Student> students = session.createQuery("from Student s where s.lastName ='Doe'").getResultList();
			
			session.getTransaction().commit();
			System.out.println("commit was succesfull");
			
			for (Student student : students) {
				System.out.println(student);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}

}

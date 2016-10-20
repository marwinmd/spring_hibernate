package com.wiechert.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wiechert.hibernate.demo.entity.Student;

public class DeleteStudentDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();


		try {
			//besser: update direkt in die query schreiben. Würde so aber auch gehen.
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			List<Student> allStudents = session.createQuery("from Student").getResultList();
			for (Student student : allStudents) {
				student.setEmail("chef@chef.de");
			}
		
			session.getTransaction().commit();
			System.out.println("commit was succesfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			factory.close();
		}
	}
}

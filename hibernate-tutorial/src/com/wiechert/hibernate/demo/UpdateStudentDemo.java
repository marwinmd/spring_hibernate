package com.wiechert.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wiechert.hibernate.demo.entity.Student;

public class UpdateStudentDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		try {
			//kann auch direkt in einer query gemacht werden. 
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			
			int studentId =1 ;
			Student myStudent = session.get(Student.class, studentId );
			session.delete(myStudent);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}
}

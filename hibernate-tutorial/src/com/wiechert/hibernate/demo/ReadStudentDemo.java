package com.wiechert.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wiechert.hibernate.demo.entity.Student;

public class ReadStudentDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		Student student = new Student("Daffy", "Duck", "daffy@googlemail.com");
		try {
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
			session.close();
			
			System.out.println("commit was succesfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {

			session = factory.getCurrentSession();
			session.beginTransaction();
			Student dbStudent = session.get(Student.class, student.getId());
			session.getTransaction().commit();
			session.close();
			
			System.out.println(dbStudent);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

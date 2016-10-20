package com.wiechert.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wiechert.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			Student student = new Student("Jens", "Kaiser", "jenskaiser@googlemail.com");
			Student student1 = new Student("Hans", "Meier", "hansmeier@icloud.com");
			Student student2 = new Student("John", "Doe", "johndoe@icloud.com");
			session.beginTransaction();
			session.save(student);
			session.save(student1);
			session.save(student2);
			session.getTransaction().commit();
			System.out.println("commit was succesfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}

}

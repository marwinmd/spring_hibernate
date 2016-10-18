package com.wiechert.springdemo;

import java.util.Iterator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		for (int i = 0; i < 10; i++) {
			System.out.println(theCoach.getDailyFortune());
		}
		context.close();
	}
}

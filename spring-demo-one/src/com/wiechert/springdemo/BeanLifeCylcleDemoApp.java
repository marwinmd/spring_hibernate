package com.wiechert.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCylcleDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach.getDailyFortune());
	
		// close the context
		context.close();
	}

}

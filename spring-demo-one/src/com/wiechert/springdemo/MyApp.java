package com.wiechert.springdemo;

public class MyApp {
	/**
	 * This is the main method/class for the application
	 */
	public static void main(String[] args) {
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
	}

}


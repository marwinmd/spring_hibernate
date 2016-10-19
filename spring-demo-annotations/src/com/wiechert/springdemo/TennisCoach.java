package com.wiechert.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Hit that fucker";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("doing the startup stuff");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("doing the cleanup stuff");
	}
}

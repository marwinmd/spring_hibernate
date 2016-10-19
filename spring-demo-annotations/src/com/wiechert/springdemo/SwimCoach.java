package com.wiechert.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService service) {
		this.fortuneService = service;
	}

	@Override
	public String getDailyWorkout() {
		return "swim, swim, swim";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}
}

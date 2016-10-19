package com.wiechert.springdemo;

public class SadFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "bad luck bryan";
	}

}

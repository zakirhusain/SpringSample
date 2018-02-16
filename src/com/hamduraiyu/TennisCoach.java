package com.hamduraiyu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Explicit bean id
//@Component("theCoach")

// Implicit bean id
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	public TennisCoach() {
		System.out.println("Tennis Coach: Inside default constructor");
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Tennis Coach: Inside setFortuneService method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	
}

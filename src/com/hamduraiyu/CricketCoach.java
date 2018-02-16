package com.hamduraiyu;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your bowling at regular sessions";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
	
}

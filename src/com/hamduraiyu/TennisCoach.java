package com.hamduraiyu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Explicit bean id
//@Component("theCoach")

// Implicit bean id
@Component
public class TennisCoach implements Coach {

	/*@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;*/
	@Value("${hr.name}")
	private String name;
	@Value("${hr.email}")
	private String email;
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TennisCoach() {
		System.out.println("Tennis Coach: Inside default constructor");
	}
	
	
	// setter injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Tennis Coach: Inside setFortuneService method");
		this.fortuneService = fortuneService;
	}*/
	
	// Custom method injection
	
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("Tennis Coach: Inside doSomeCrazyStuff method");
		this.fortuneService = fortuneService;
	}*/
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	
}

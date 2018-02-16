package com.hamduraiyu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		//Coach theCricketCoach = context.getBean("cricketCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//System.out.println(theCricketCoach.getDailyWorkout());
		
		System.out.println("Name: " + theCoach.getName() + " " + " Email " + theCoach.getEmail());
		
		
		context.close();
	}

}

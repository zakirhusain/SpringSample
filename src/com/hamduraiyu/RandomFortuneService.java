package com.hamduraiyu;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Successful people have fear, successful people have doubts, and successful people have worry. They just don’t let these feelings stop them.",
			"Practice the art of interpreting situations constructively.",
			"The best teachers are those who show you where to look, but don't tell you what to see."
	};
	
	private Random myRandom = new  Random();
	
	@Override
	public String getDailyFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}

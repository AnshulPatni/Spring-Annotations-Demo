package com.anshul.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings for fortune services
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// create a random number generator
	private Random myRandom = new Random(); 
	
	@Override
	public String getFortune() {
		//  pick a random string from the array
		int rnd = myRandom.nextInt(data.length);
		String theFortune = data[rnd];
		return theFortune;
	}

}

package ua.com.qalight.util;

import java.util.Random;

public class Randomizer {
	
	public static int getNumberInRange(int min, int max) {
		
//		1
		Random random = new Random();
		return min + random.nextInt(max-min);
//		2
//		return min + ((int)(Math.random()*(max - min)));
		
		
	}

}

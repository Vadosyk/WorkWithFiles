package src.ua.com.qalight.util;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import ua.com.qalight.util.Randomizer;

class RandomizerTest {

	@Test
	void testGetNumberInRang() {
		int result = Randomizer.getNumberInRange(10, 50);
		assertTrue(result >=10 && result<=50);
		
	}

}

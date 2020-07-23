package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	

	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		
		int expected = 11;
		int actual = mathUtils.add(5, 5);	
		
		assertEquals(expected, actual);
	}

}

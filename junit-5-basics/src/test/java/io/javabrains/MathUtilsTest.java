package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		
		int expected = 10;
		int actual = mathUtils.add(5, 5);	
		
		assertEquals(expected, actual, "The add method should add tow numbers");		
	}
	
	@Test
	void tesComputeCircleRadius() {
		MathUtils mathUtils = new MathUtils();
		
		assertEquals(314.1592653589793, mathUtils.conputeCircleArea(10),
				"Should return right circle area");		
	}
	
	
 
}

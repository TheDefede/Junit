package io.javabrains;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This need to run before all");
	}
	
	MathUtils mathUtils;
	
	@BeforeEach
	void init(){
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up....");
	}

	@Test
	void testAdd() {
		
		int expected = 10;
		int actual = mathUtils.add(5, 5);	
		
		assertEquals(expected, actual, "The add method should add tow numbers");		
	}
	
	@Test
	void tesComputeCircleRadius() {
		
		assertEquals(314.1592653589793, mathUtils.conputeCircleArea(10),
				"Should return right circle area");		
	}
	
	@Test
	void testDivide() {		
		assertThrows(ArithmeticException.class, ()-> mathUtils.divide(1, 0), "Divide by  zero should throw");

	}
 
}

package io.javabrains;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
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
	@DisplayName("Testing add method")	
	void testAdd() {
		
		boolean isServerUp = false;
		
		assumeTrue(isServerUp);
		
		int expected = 10;
		int actual = mathUtils.add(5, 5);	
		
		assertEquals(expected, actual, "The add method should add tow numbers");		
	}
	
	@Test
	@DisplayName("Circle Radius Method")
	void tesComputeCircleRadius() {
		
		assertEquals(314.1592653589793, mathUtils.conputeCircleArea(10),
				"Should return right circle area");		
	}
	
	@Test
	@DisplayName("Divide Method")
	void testDivide() {		
		assertThrows(ArithmeticException.class, ()-> mathUtils.divide(1, 0), "Divide by  zero should throw");

	}
	
	@Test
	@Disabled
	@DisplayName("TDD method disabled")
	void testDisabled() {
		fail("This test sould be disabled");
	}
 
}

package io.javabrains;



import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

@DisplayName("When runnung MathUtils")
class MathUtilsTest {
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This need to run before all");
	}
	
	MathUtils mathUtils;
	TestInfo testInfo;
	TestReporter testReporter;
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter){
		this.testInfo = testInfo;
		this.testReporter = testReporter;
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
	
	@Nested
	@DisplayName("add method")
	@Tag("Math")
	class Addtest{
		
		@Test
		@DisplayName("when adding two positive numbers")
		void testAddpositive() {
			int expected = 2;
			int actual= mathUtils.add(1, 1);
			assertEquals(expected, actual, ()-> "should return " + expected + "but returned " + actual);
		}
		
		@Test
		@DisplayName("when adding two negative numbers")
		void testAddNegative() {
			assertEquals(-2, mathUtils.add(-1, -1), "should return the right sum");
		}
	}
	
	@Test
	@Tag("Math")
	@DisplayName("Circle Radius Method")
	void tesComputeCircleRadius() {
		
		assertEquals(314.1592653589793, mathUtils.conputeCircleArea(10),
				"Should return right circle area");		
	}
	
	@RepeatedTest(3)
	@Tag("Circle")
	@DisplayName("Divide Method")
	void testDivide(RepetitionInfo repetitionInfo) {
		repetitionInfo.getCurrentRepetition();
		assertThrows(ArithmeticException.class, ()-> mathUtils.divide(1, 0), "Divide by  zero should throw");

	}
	
	@Test
	@Tag("Math")
	@DisplayName("multiply method")
	void testMultiply() {
		System.out.println("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
		assertEquals(4, mathUtils.multiply(2, 2),"should return the right product");
		assertAll(
				()-> assertEquals(4, mathUtils.multiply(2, 2)),
				()-> assertEquals(0, mathUtils.multiply(-2, 0)),
				()-> assertEquals(6, mathUtils.multiply(3, 2)),
				()-> assertEquals(10, mathUtils.multiply(2, 5)),
				()-> assertEquals(6, mathUtils.multiply(2, 3))
				);		
	}
	
	@Test
	@Disabled
	@DisplayName("TDD method disabled")
	void testDisabled() {
		fail("This test sould be disabled");
	}
	

 
}

package com.techmind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("When running MathUtils")
class MathUtilsTest {

	MathUtils mathUtils;
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This method run before all");
	}
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up....");
	}
	
	@Nested
	@DisplayName("add method")
	class AddTest {

		@Test
		@DisplayName("Addition for two number")
		void testAddIntInt() {
			int firstNum = 10;
			int secondNum = 20;
			assertEquals(30, MathUtils.add(firstNum, secondNum), "This method is should be add two numbers");
		}

		@Test
		@DisplayName("Addition for an array")
		void testAddIntArray() {
			int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			assertEquals(55, MathUtils.add(arr), "Addition of an array");
		}
	}
	
	@Test
	@Disabled
	@DisplayName("Substarct of two nos.")
	void testSubtract() {
	}

	
	@Test
	@DisplayName("Multiply of two nos.")
	void testMultiply() {
		assertAll(
				() -> assertEquals(0, mathUtils.multiply(1, 0), "Output of multiply should be 0"),
				() -> assertEquals(1, mathUtils.multiply(1, 1), "Output of multiply should be 1"),
				() -> assertEquals(6, mathUtils.multiply(2, 3), "Output of multiply should be 6")
				);
	}

	@Test
	@DisplayName("Divide of two nos.")
	void testDivide() {
		assertThrows(ArithmeticException.class, ()->mathUtils.divide(1, 0),"Divide by zero should throw Error");
	}
	

}

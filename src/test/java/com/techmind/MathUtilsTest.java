package com.techmind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
	
	@Test
	@DisplayName("Addition for two number")
	void testAddIntInt() {
		int firstNum = 10;
		int secondNum = 20;
		assertEquals(MathUtils.add(firstNum, secondNum), 30 , "This method is should be add two numbers");
	}

	@Test
	@DisplayName("Addition for an array")
	void testAddIntArray() {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		assertEquals(MathUtils.add(arr), 55 ,"Addition of an array");
	}
	
	@Test
	@Disabled
	@DisplayName("Substarct of two nos.")
	void testSubtract() {
	}

	
	@Test
	@Disabled
	@DisplayName("Multiply of two nos.")
	void testMultiply() {
	}

	@Test
	@DisplayName("Divide of two nos.")
	void testDivide() {
		assertThrows(ArithmeticException.class, ()->mathUtils.divide(1, 0),"Divide by zero should throw Error");
	}
	

}

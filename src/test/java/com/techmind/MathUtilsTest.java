package com.techmind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathUtils;
	
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
	void testSubtract() {
	}

	
	@Test
	void testMultiply() {
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, ()->mathUtils.divide(1, 0),"Divide by zero should throw Error");
	}
	

}

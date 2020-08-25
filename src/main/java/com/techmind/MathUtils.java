package com.techmind;

public class MathUtils {

	public static int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public static int add(int[] arr) {
		int sum = 0;
		for (int num : arr)
			sum = sum + num;
		return sum;
	}
}

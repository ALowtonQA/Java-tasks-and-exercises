package com.qa.day1;

public class FizzBuzz {

	public static String method1 (Integer input) {
		if (input % 3 == 0 && input % 5 == 0) {
			return "FizzBuzz";
		} else if (input % 3 == 0) {
			return "Fizz";
		} else if (input % 5 == 0) {
			return "Buzz";
		} else {
			return input.toString();
		}
	}
}

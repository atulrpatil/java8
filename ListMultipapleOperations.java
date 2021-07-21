package com.atul.patil.java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ListMultipapleOperations {

	// Write a Java 8 program to square the list of numbers and then filter out
	// the numbers greater than 100 and then find the average of the remaining
	// numbers
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(100, 100, 9, 8, 200);
		OptionalDouble avg = list.stream().mapToInt(n -> n * n)
				.filter(n -> n > 100).average();

		if (avg.isPresent()) {
			System.out.println(avg.getAsDouble());
		}

	}

}

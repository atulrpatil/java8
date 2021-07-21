package com.atul.patil.java8;

import java.util.Arrays;
import java.util.List;

public class SumOfListElement {

	// Write a Java 8 program to get the sum of all numbers present in a list?
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = list.stream().mapToInt(n -> n).sum();
		System.out.println(sum);

	}

}

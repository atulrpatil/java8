package com.atul.patil.java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.Collectors;

public class StringLenghtDemo {

	// Write a Java 8 program to find the number of Strings in a list whose
	// length is greater than 5?
	public static void main(String[] args) {

		List<String> list = Arrays.asList("atulPatil", "amol", "tejaswini");

		Long count = list.stream().filter(n -> n.length() > 5).count();

		List<String> filterList = list.stream().filter(n -> n.length() > 5).collect(Collectors.toList());

		System.out.println("filter List " + filterList);

		System.out.println(count);
	}

}

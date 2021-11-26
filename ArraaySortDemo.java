package com.atul.patil.java8;

import java.util.Arrays;

public class ArraaySortDemo {

	// Write a Java 8 program to sort an array and then convert the sorted array
	// into Stream 1234

	public static void main(String[] args) {

		Integer[] array = { 99, 55, 203, 99, 4, 91 };

		Arrays.parallelSort(array);

		Arrays.stream(array).forEach(System.out::println);

	}

}

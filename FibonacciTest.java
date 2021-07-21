package com.atul.patil.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciTest {

	public static void main(String[] args) {

		System.out.println(FibonacciTest.generate(10));
		System.out.println(FibonacciTest.sum(10));
		System.out.println(FibonacciTest.getCommaSeprateFibNumber(10));

	}

	/** List */
	private static List generate(int limit) {

		return Stream
				.iterate(new int[] { 0, 1 },
						s -> new int[] { s[1], s[0] + s[1] }).limit(limit)
				.map(n -> n[0]).collect(Collectors.toList());

	}

	/** Sum of numbers */
	private static int sum(int limit) {

		int sum = Stream
				.iterate(new int[] { 0, 1 },
						s -> new int[] { s[1], s[0] + s[1] }).limit(10)
				.map(n -> n[0]).mapToInt(Integer::intValue).sum();
		return sum;
	}

	/** comma separated */
	private static String getCommaSeprateFibNumber(int limit) {
		return Stream
				.iterate(new int[] { 0, 1 },
						s -> new int[] { s[1], s[0] + s[1] }).limit(limit)
				.map(n -> n[0]).map(String::valueOf)
				.collect(Collectors.joining(","));
	}

}

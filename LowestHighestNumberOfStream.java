package com.atul.patil.java8;

import java.util.Comparator;
import java.util.stream.Stream;

public class LowestHighestNumberOfStream {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 2, 3, 77, 6, 5);

		Integer highest =
		 Stream.of(1, 2, 3, 77, 6, 5).max(Comparator.comparingInt(Integer::valueOf)).get();

		Integer lowest = Stream.of(1, 2, 3, 77, 6, 5).min(Comparator.comparingInt(Integer::valueOf)).get();

		System.out.println("Highest Number " + highest);
		System.out.println("Lowest Number " + lowest);

		Integer min = Stream.of(1, 2, 3, 77, 6, 5).min((i1, i2) -> i1.compareTo(i2)).get();
		
		System.out.println("Min"+min);
		
		Integer max = Stream.of(1, 2, 3, 77, 6, 5).max((i1, i2) -> i1.compareTo(i2)).get();

		System.out.println("Max "+max);
	}

}

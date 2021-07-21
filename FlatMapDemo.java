package com.atul.patil.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {

		List<List<String>> nameList = Arrays.asList(
				Arrays.asList("atul", "rahul"), Arrays.asList("Teju", "Dev"));

		List<String> upperName = nameList.stream().flatMap(n -> n.stream())
				.map(n -> n.toUpperCase()).collect(Collectors.toList());

		System.out.println(upperName);

	}

}

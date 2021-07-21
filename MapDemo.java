package com.atul.patil.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		List<String> lowerNames = Arrays.asList("atul", "patil");
		
		List<String> upperName=lowerNames.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperName);

	}

}

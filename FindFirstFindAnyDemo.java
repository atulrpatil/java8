package com.atul.patil.java8;

import java.util.stream.Stream;

public class FindFirstFindAnyDemo {

	public static void main(String[] args) {

		String first = Stream.of("Atul", "Sagar", "Amol").findFirst().toString();
		System.out.println("find first : " + first);
		
		String any= Stream.of("Atul", "Sagar", "Amol").findAny().toString();
		System.out.println("find any : "+any);

	}

}

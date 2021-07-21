package com.atul.patil.java8;

import java.util.stream.Stream;

public class LimitSkipDemo {

	public static void main(String[] args) {
	
		Stream.of(1,2,3,4,5,6,7).limit(3).forEach(num->System.out.println(num));
		
		System.out.println("############################################");
		
		Stream.of(1,2,3,4,5,6,7).skip(3).forEach(System.out::println);

	}

}

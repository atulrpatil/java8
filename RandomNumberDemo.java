package com.atul.patil.java8;

import java.util.Random;

public class RandomNumberDemo {

	//Write a program to print 5 random numbers in sorted order using forEach in Java 8?
	public static void main(String[] args) {
		
		Random random = new Random();
		random.ints().limit(5).sorted().forEach(System.out::println);

	}

}

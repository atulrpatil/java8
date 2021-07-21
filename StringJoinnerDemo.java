package com.atul.patil.java8;

import java.util.StringJoiner;

public class StringJoinnerDemo {

	public static void main(String[] args) {

		StringJoiner joiner= new StringJoiner("," , "(" , ")" );
		
		joiner.add("atul");
		joiner.add("Amol");
		joiner.add("Dev");
		
		System.out.println(joiner);
	}

}

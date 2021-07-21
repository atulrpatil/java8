package com.atul.patil.java8;

import java.util.stream.IntStream;

public class PalindromeTest {

	public static void main(String[] args) {

		System.out.println(isPalindromeUsingIntStream("151"));
		System.out.println(isPalindromeUsingIntStream("madam"));
		System.out.println(isPalindromeUsingIntStream("level"));
		System.out.println(isPalindromeUsingIntStream("radar"));
		System.out.println(isPalindromeUsingIntStream("Atul"));

	}

	public static boolean isPalindromeUsingIntStream(String text) {
		String temp = text.replaceAll("\\s+", "").toLowerCase();
		
		return IntStream.range(0, temp.length() / 2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
	}

}

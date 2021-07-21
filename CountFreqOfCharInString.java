package com.atul.patil.java8;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfCharInString {

	// Write java 8 program to count freq of char in String
	public static void main(String[] args) {

		String testString = "abcadgdfjytred";

		Map<Character, Integer> freq = new HashMap<>();

		for (char c : testString.toCharArray()) {

			freq.merge(c, 1, Integer::sum);
		}
		
		System.out.println(freq);

	}

}

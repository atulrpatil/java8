package com.atul.patil.java8;

import java.util.HashMap;
import java.util.Map;

public class WordCountDemo {

	public static void main(String[] args) {

		String s = "atul,amol,atul,dev,teju,amol";

		String[] array = s.split(",");

		Map<String, Integer> freq = new HashMap<>();

		for (String string : array) {
			freq.merge(string, 1, Integer::sum);
		}

		System.out.println(freq);
	}

}

package com.atul.patil.java8;

import java.util.Arrays;

public class AnagramString {

	static boolean isAngram(String str1, String str2) {
		boolean status;

		if (null == str1 || null == str2) {
			status = false;
		} else {

			String s1 = str1.replaceAll("\\s", "");
			String s2 = str2.replaceAll("\\s", "");

			if (s1.length() != s2.length()) {
				status = false;
			} else {

				char[] array1 = s1.toLowerCase().toCharArray();
				char[] array2 = s2.toLowerCase().toCharArray();

				Arrays.parallelSort(array1);
				Arrays.parallelSort(array2);

				status = Arrays.equals(array1, array2);
			}
		}

		return status;
	}

	public static void main(String args[]) {

		//System.out.println(isAngram("army", "mary"));
		System.out.println(isAngram("Mother In Law", "Hitler Woman"));
		System.out.println(isAngram("army", null));
		System.out.println(isAngram("", "mary"));
		System.out.println(isAngram("army", "mar"));

	}

}

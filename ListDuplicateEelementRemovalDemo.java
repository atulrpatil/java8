package com.atul.patil.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListDuplicateEelementRemovalDemo {

	//Write a Java 8 program to remove the duplicate elements from the list
	public static void main(String[] args) {
		List<Integer> duplicateList= Arrays.asList(3,5,6,7,4,6,3);
		
		Set<Integer> noDuplicates= duplicateList.stream().collect(Collectors.toSet());
		
		System.out.println(noDuplicates);

	}

}

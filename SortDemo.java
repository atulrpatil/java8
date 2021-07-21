package com.atul.patil.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,6,6,3,4,7,8);
		//List<Integer> asendingSort= list.stream().sorted().collect(Collectors.toList());
		
		List<Integer> asendingSort=list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("asendingSort "+ asendingSort);
		
		List<Integer> desendingSort=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("desendingSort "+desendingSort);
	}

}

package com.atul.patil.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListMeargeDemo {

	public static void main(String[] args) {
	
		List<String> list1= new ArrayList<>();
		list1.add("Atul");
		list1.add("Amol");
		
		List<String> list2= new ArrayList<>();
		list2.add("Teju");
		list2.add("Dev");
		
		//list1.addAll(list2);
		//System.out.println(list1);
		
		
		List<String> list3= Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		
		System.out.println("############");
		
		System.out.println(list3);
		System.out.println("############");
		
		List<String> list4= Stream.of(list1,list2).flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println(list4);
		

	}

}

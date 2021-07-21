package com.atul.patil.java8;

import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceDemo {

	public static void main(String[] args) {

		Consumer<String> str = str1 -> System.out.println(str1);
		str.accept("Atul");

	}

}

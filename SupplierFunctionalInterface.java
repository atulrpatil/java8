package com.atul.patil.java8;

import java.util.function.Supplier;

public class SupplierFunctionalInterface {

	public static void main(String[] args) {

		Supplier<String> str = () -> "Atul";
		System.out.println(str.get());

	}

}

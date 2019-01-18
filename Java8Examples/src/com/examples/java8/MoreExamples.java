package com.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MoreExamples {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Shasha", "Hello");

		Predicate<String> p = (n) -> n.equalsIgnoreCase("Shasha");

		names.forEach(System.out::println); // -> Example of method reference

		// Functional Interface Example In predicate Test is one and only abstract
		// method

		names.stream().forEach(name -> {
			if (p.test(name)) {
				System.out.println("Matched");
			}
		});

		
		System.out.println(names.stream().anyMatch(p));
	}

}

package com.examples.java8;

import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examples {

	public static void main(String[] args) throws ParseException {

		List<Employee> employees = new Employee().getEmployees();

		Map<String, List<Employee>> map1 = employees.stream().collect(Collectors.groupingBy(Employee::getStream));
		System.out.println(map1);

		System.out.println(employees.stream().map(e -> e.getAddress()).filter(Objects::nonNull).map(a -> a.getCity())
				.filter(Objects::nonNull).collect(Collectors.joining(",")));

		System.out.println(
				employees.stream().map(e -> e.getAddress()).filter(Objects::nonNull).collect(Collectors.toList()));

		System.out.println(String.join(",", map1.keySet()));

		System.out.println(employees.stream().map(Employee::getName).sorted().collect(Collectors.joining(",")));

		System.out.println(
				String.join(",", employees.stream().map(Employee::getName).sorted().collect(Collectors.toSet())));

		Map<String, Long> count = employees.stream()
				.collect(Collectors.groupingBy(Employee::getStream, Collectors.counting()));
		System.out.println(count);

		Map<String, Set<String>> count2 = employees.stream().collect(
				Collectors.groupingBy(Employee::getStream, Collectors.mapping(Employee::getName, Collectors.toSet())));
		System.out.println(count2);

		System.out.println(Math.min(Double.MIN_VALUE, 0.0D));
		// Math.min will compare args which is min

		// IntStream.range(65, 80).boxed().forEach(i -> System.out.println(i + "--->" +
		// getRandomChar(i)));

		// Double will give infinity
		System.out.println(1.1 / 0.0);

		// FindAny else
		Employee selectedEmployee = employees.stream().filter(i -> "AAAA".equals(i.getName())).findAny().orElse(null);
		System.out.println(selectedEmployee);

		String employeeName = employees.stream()
				.filter((i) -> "AAA".equals(i.getName()) && "IT".equalsIgnoreCase(i.getStream())).map(Employee::getName)
				.findAny().orElse(null);
		System.out.println(employeeName);

		// Find any for One Object and for list of objects collectors.toList
		List<String> streams = employees.stream().map(Employee::getStream).collect(Collectors.toList());
		System.out.println(streams);
		// To avoid duplicates change it to set

		System.out.println(streams.stream().map(String::toLowerCase).collect(Collectors.toList()));

		// Arrays to Stream
		Stream<String> stream = Arrays.stream(new String[] { "SHA", "SHA", "NK", null });

		// Arrays to stream internally uses arrays.stream
		Stream.of(new String[] { "SHA", "SHA", "NK" });

		// Streams to List, prints null to filtering null given below
		List<String> list = stream.filter(Objects::nonNull).collect(Collectors.toList());
		list.forEach(System.out::println);

		// In above line stream already used if try to use same stream Issue appears
		// to check uncomment below line

		// stream.forEach(System.out::println); // -> gives error stream has already
		// been operated upon or closed

		// Multiple usage of streams

		Supplier<Stream<String>> supplier = () -> Arrays.stream(new String[] { "SHA", "SHA", "NK", null });
		System.out.println(supplier.get().filter(Objects::nonNull).collect(Collectors.toList()));
		// here if we not filter stream with null it will null pointer
		System.out
				.println(supplier.get().filter(Objects::nonNull).map(String::toLowerCase).collect(Collectors.toList()));

		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		// unsortMap.entrySet().forEach(System.out::println);

		System.out.println(unsortMap);
		System.out.println(unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldval, newval) -> oldval, LinkedHashMap::new)));

		Predicate<RecoverySystem> s = e -> e.name().equals("COBPREVENTION");

		System.out.println(Arrays.stream(RecoverySystem.values()).anyMatch(s));

		System.out.println("----------------------------------------------------------------");
		String per = "85%";

		Double d = Double.valueOf(per.replace("%", ""))/100;
		System.out.println(String.valueOf(d) );

	}

	private static String getRandomChar(int i) {

		return String.valueOf((char) i);
	}

}
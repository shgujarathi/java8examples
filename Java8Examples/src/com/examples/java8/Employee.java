package com.examples.java8;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private Long id;
	private String name;
	private String stream;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public Employee(Long id, String name, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", stream=" + stream + "]";
	}

	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10L, "YYY", "CSE"));
		employees.add(new Employee(10L, "KKK", "IT"));
		employees.add(new Employee(10L, "AAA", "IT"));
		employees.add(new Employee(10L, "SSS", "CSE"));
		employees.add(new Employee(10L, "DDD", "CSE"));
		employees.add(new Employee(10L, "TTT", "ECE"));
		employees.add(new Employee(10L, "YYY", "ECE"));
		return employees;

	}

}

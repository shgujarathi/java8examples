package com.examples.java8;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private Long id;
	private String name;
	private String stream;
	private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(Long id, String name, String stream, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
		this.address = address;
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
		employees.add(new Employee(10L, "YYY", "CSE", new Address("Ssfg", null, "aaaaL", "dddK")));
		employees.add(new Employee(10L, "KKK", "IT", new Address("wsgfd", "Zdgfghdh", "Lww", "Kdd")));
		employees.add(new Employee(10L, "AAA", "IT", new Address("sfge", "Zre", "Lcc", "Kgafsd")));
		employees.add(new Employee(10L, "SSS", "CSE", null));
		employees.add(new Employee(10L, "DDD", "CSE", new Address("Sse", "Zgd", "Lyy", "adfaK")));
		employees.add(new Employee(10L, "TTT", "ECE", new Address("Sgdf", "Zg", "Lee", "Khfgdhdf")));
		employees.add(new Employee(10L, "YYY", "ECE", new Address("Ssfh", "Zet", "Ltt", "Ksfse")));
		return employees;
	}

}

package com.examples.java8;

public class Address {

	private String street;
	private String city;
	private String State;
	private String Country;

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return State;
	}

	public String getCountry() {
		return Country;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		State = state;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Address(String street, String city, String state, String country) {
		super();
		this.street = street;
		this.city = city;
		State = state;
		Country = country;
	}

	@Override
	public String toString() {
		return "[street=" + street + ", city=" + city + ", State=" + State + ", Country=" + Country + "]";
	}

}

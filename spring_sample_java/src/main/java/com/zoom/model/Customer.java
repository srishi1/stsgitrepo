package com.zoom.model;

public class Customer {

	private String firstname;
	private String lastname;
	
	public Customer () {
		System.out.println("inside Customer default constructor");

	}

	public String getFirstname() {
		System.out.println("inside getFirstName class");
		return firstname;
	}

	public void setFirstname(String firstname) {
		System.out.println("inside setFirstName class");
		this.firstname = firstname;
	}

	public String getLastname() {
		System.out.println("inside getLastName class");
		return lastname;
	}

	public void setLastname(String lastname) {
		System.out.println("inside setLastName class");
		this.lastname = lastname;
	}

}

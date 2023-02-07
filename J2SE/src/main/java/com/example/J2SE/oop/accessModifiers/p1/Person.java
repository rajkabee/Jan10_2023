package com.example.J2SE.oop.accessModifiers.p1;

public class Person {
	String name;
	protected String email;
	private long contact;
	public int age;
	
	
	public Person(String name, String email, long contact) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
	}

	
	public Person() {
		super();
	}

	
}

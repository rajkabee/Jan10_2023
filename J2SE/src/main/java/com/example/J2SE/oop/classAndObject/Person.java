package com.example.J2SE.oop.classAndObject;

public class Person {
	String name;
	String email;
	long contact;
	static String country;
	
	public Person(String name, String email, long contact) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
	}

	
	public Person() {
		super();
	}

	public void call() {
		System.out.println("Calling "+name+" on "+contact+"...");
	}
}

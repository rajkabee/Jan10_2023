package com.example.J2SE.oop.inheritance;

public class Person {
	int NationalId;
	String name;
	String address;
	@Override
	public String toString() {
		return "Person [NationalId=" + NationalId + ", name=" + name + ", address=" + address + "]";
	}
	
	public void greet(){
		System.out.println("Hello");
	}
	
}

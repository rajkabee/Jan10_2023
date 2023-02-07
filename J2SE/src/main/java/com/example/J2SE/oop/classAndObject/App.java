package com.example.J2SE.oop.classAndObject;

public class App {
	public static void main(String[] args) {
		int i=0;
		int j=5;
		Person.country="China";

		Person p = new Person();
		//p.country="Nepal";
		Person p2 = new Person("Sanjay", "sanjay@gmail.com", 9875663345l);
		p.name="Pratyush";
		p.email = "pratyush@gmail.com";
		p.contact = 9878563342l;
		//p2.country="Japan";
//		p2.name="Pranaya";
//		p2.email = "pranaya@gmail.com";
//		p2.contact = 9855462566l;
		System.out.println("Name: "+p.name);
		System.out.println("Email: "+p.email);
		System.out.println("Contact: "+p.contact);
		System.out.println("Country: "+p.country);
		System.out.println();
		System.out.println("Name: "+p2.name);
		System.out.println("Email: "+p2.email);
		System.out.println("Contact: "+p2.contact);
		System.out.println("Country: "+p2.country);
		p.call();
		
		System.out.println(p.toString());
	}
}

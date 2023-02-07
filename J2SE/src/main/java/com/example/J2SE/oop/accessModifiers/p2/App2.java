package com.example.J2SE.oop.accessModifiers.p2;

import com.example.J2SE.oop.accessModifiers.p1.Person;

public class App2 {
	public static void main(String[] args) {
		Person p = new Person();
//		p.name="santosh";
//		p.email = "santosh@gmail.com";
//		p.contact = 9846655266l;
		p.age=25;
//		System.out.println(p.name);
//		System.out.println(p.email);
		System.out.println(p.age);
	}
}

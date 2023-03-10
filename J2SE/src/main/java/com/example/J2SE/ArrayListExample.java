package com.example.J2SE;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		myList.add("Ramesh Basnet");
		myList.add("Roshan Khatowada");
		myList.add(123456);
		myList.add(true);
		myList.add(22.34f);
		System.out.println(myList);
		System.out.println(myList.get(2));
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Ramesh Basnet");
		names.add("Roshan Khatowada");
		//names.add(false);
		
		//System.out.println(names);
		names.forEach(System.out::println);
		names.forEach(name->System.out.println(name));
		for(String name:names) {
			System.out.println(name);
		}
		
	}
}

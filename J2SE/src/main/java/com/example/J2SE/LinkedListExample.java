package com.example.J2SE;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.add("Ramesh Basnet");
		myList.add("Roshan Khatowada");
		myList.add(123456);
		myList.add(true);
		myList.add(22.34f);
		System.out.println(myList);
		System.out.println(myList.get(2));
		
		LinkedList<String> names = new LinkedList<>();
		names.add("Ramesh Basnet");
		names.add("Roshan Khatowada");
		//names.add(false);
		
		System.out.println(names);
		
	}
}

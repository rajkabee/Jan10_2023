package com.example.J2SE.oop.encapsulation;

public class App {
	public static void main(String[] args) {
		Product p = new Product();
		p.setId(123);
		System.out.println(p.getId());
		Product pd = new Product(147, "Jordan 5", "Nike", 4500f);
		System.out.println(pd);
	}
}

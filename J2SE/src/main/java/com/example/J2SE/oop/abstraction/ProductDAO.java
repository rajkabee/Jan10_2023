package com.example.J2SE.oop.abstraction;

public class ProductDAO extends AbstractDAO{

	@Override
	public void write() {
		System.out.println("Product Added to the database!");	
	}

	@Override
	public void read() {
		System.out.println("Product fetched from the database!");
	}

	
	
}

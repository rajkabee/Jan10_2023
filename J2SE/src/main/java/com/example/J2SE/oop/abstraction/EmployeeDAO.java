package com.example.J2SE.oop.abstraction;

public class EmployeeDAO extends AbstractDAO{
	@Override
	public void write() {
		System.out.println("Employee Added to the database!");	
	}

	@Override
	public void read() {
		System.out.println("Employee fetched from the database!");
	}
}

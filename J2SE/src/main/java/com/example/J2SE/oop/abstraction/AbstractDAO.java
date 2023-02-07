package com.example.J2SE.oop.abstraction;

public abstract class AbstractDAO implements DAO{

	
	public void connect() {
		System.out.println("Connected to the Database!");
	}
	
	public void disconnect(){
		System.out.println("Disconnected from the Database!");
	}

	
	
}

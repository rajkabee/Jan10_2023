package com.example.J2SE.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		//Hello hello = new Hi();
		Hello hello = ()->{
			System.out.println("Hello Interface!");
		};
		
		hello.greet();
		List<String> names = new ArrayList<String>(); 
		names.forEach((name)->{
			System.out.println(name);
		});
	}
}

interface Hello{
	public void greet();
}

class Hi implements Hello{
	public void greet() {
		System.out.println("greetings");
	}
}
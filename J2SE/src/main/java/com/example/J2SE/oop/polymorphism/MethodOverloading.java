package com.example.J2SE.oop.polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		int a=5;
		int b=7;
		int c=13;
		
		int sum1=add(a,b);
		int sum2=add(a,b,c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int add(int x,int y) {
		return x+y;
	}
	static int add(int x, int y, int z) {
		return x+y+z;
	}
}

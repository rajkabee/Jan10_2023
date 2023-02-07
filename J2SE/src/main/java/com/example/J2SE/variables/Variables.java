package com.example.J2SE.variables;

import java.util.Scanner;

public class Variables {
	
	public static void main(String[] args) {
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 9223372036854775807l;
		
		float f = 1.234567f;
		double d = 1.234567;
		
		char ch = '?';
		
		boolean bool = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.next();
		int res = (int) Math.pow(2, 5);
		System.out.println("How Old are you?");
		
		int age = sc.nextInt();
		System.out.println("Hello World!");
		System.out.println(name);
		System.out.println("name: "+name);
		System.out.println(String.format("Name: %s, age: %d", name, age));
		
		
	}
	/*
	 
	 Variable types:
	 	Integer
	 		+-whole numbers
	 		byte	8bits	-128 to +127
	 		short	16bits	-32768 to +32767
	 		int		32bits	-2.147billions
	 		long	64bits	-9.223bb
	 	Float
	 		float	1.234f
	 		double	4.2457
	 	Character	
	 		char ch = '?';
	 	Boolean
	 		boolean con = false;
	 	String
	 		String name = "Sanjeev";
	 		String st = new String();
	 */
}

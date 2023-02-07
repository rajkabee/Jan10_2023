package com.example.J2SE.methods;

import java.util.Scanner;

public class MethodsExample {
	public static void main(String[] args) {
		int a=5, b=7, sum;
		sum = add(a,b,0);
		System.out.println("Sum: "+sum);
		subtract(a,b);
		int prod = multiply();
		System.out.println("Product: "+prod);
		//division();
	}
	/*
	 
	  return_type method_name(arguments/optional){
	  		logical operations
	  		
	  		return statement;		//optional
	  }
	 
	 */
	static int add(int x, int y) {
		System.out.println("1st method");
		int c;
		c=x+y;
		return c;
	}
	static int add(int a, int b, int c) {
		System.out.println("2nd method");
		int d;
		d=a+b+c;
		return d;
	}
	
	static void subtract(int x, int y) {
		int res;
		res=x-y;
		System.out.println("Difference: "+res);
	}
	
	static int multiply() {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int product = a*b;
		return product;
	}
	
	static void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter divident: ");
		int a = sc.nextInt();
		System.out.println("Enter divisor: ");
		int b = sc.nextInt();
		int quotient = a/b;
		System.out.println("Quotient: "+quotient);
	}
	
}

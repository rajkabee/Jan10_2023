package com.example.J2SE.loops;

public class WhileLoop {
	public static void main(String[] args) {
		int i = 1;			//initialization
		while(i<=5) {		//while(condition)
			System.out.println(i+". While Loop");
			i++;			//iteration
		}
		
		int b = 2;
		int p = 5;
		int res = 1;
		while(p!=0) {
			res*=b;
			p--;
		}
		System.out.println("result: "+res);
	}
}

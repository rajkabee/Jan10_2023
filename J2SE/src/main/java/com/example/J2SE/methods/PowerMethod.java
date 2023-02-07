package com.example.J2SE.methods;

import java.util.Scanner;

public class PowerMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int b = sc.nextInt();
		System.out.println("Enter the power value: ");
		int p = sc.nextInt();
		int res = power(b,p);
		System.out.println("Result: "+res);
	}
	static int power(int b, int p){
		int res=1;
		while(p!=0) {
			res*=b;
			p--;
		}
		return res;
	}
}

package com.example.J2SE.loops.practice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int n, product=1;
		System.out.println("Enter a number: ");
		n = new Scanner(System.in).nextInt();
		for(int i=1; i<=n; i++) {
			product*=i;
		}
		System.out.println("Factorial of "+n+" : "+product);
	}
}

package com.example.J2SE.loops.practice;

import java.util.Scanner;

public class SumN {
	public static void main(String[] args) {
		int n, sum=0;
		System.out.println("Enter a number: ");
		n = new Scanner(System.in).nextInt();
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println("Sum of "+n+" natural number: "+sum);
	}
}

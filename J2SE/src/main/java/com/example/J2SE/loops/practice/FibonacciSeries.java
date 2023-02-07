package com.example.J2SE.loops.practice;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter the no. of fibonacci values: ");
		int num = new Scanner(System.in).nextInt();
		int n1=0, n2=1, n3;
		for(int i=0; i<num; i++) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}

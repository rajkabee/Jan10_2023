package com.example.J2SE.loops.practice;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int p, b, res;
		System.out.println("Enter the base: ");
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		System.out.println("Enter the power: ");
		p = sc.nextInt();
		res=1;
		while(p!=0) {
			res*=b;
			p--;
		}
		System.out.println("result: "+res);
	}
}

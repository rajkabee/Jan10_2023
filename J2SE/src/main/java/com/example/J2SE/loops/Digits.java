package com.example.J2SE.loops;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int num = new Scanner(System.in).nextInt();
		int digits=0;
		while(num!=0) {
			num/=10;
			digits++;
		}
		System.out.println("The no. of digits: "+digits);
	}
}

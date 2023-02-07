package com.example.J2SE.loops.practice;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(num==sum) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not a Perfect number");

		}
	}
}

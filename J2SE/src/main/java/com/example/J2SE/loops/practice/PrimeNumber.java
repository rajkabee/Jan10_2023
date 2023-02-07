package com.example.J2SE.loops.practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int i, flag=0;
		for(i=2; i<=num/2; i++) {
			if(num%i==0){
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("Composite");
		}
		
	}
}

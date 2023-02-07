package com.example.J2SE.nestedLoops;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int armValue=0;
		int d=0;
		int temp=num;
		while(temp!=0) {
			temp/=10;
			d++;
		}
		temp=num;
		System.out.println(temp);
		while(temp!=0) {
			int rem = temp%10;
			int res=1;
			for(int i=0; i<d; i++) {
				res*=rem;
			}
			armValue+=res;
			temp/=10;
		}
		if(num==armValue) {
			System.out.println("Armstrong Number!");
		}
		else {
			System.out.println("not a Armstrong Number!");
		}
		
		
		
	}
}

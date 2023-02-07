package com.example.J2SE.loops;

import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		System.out.println("Enter a decimal number: ");
		int dec = new Scanner(System.in).nextInt();//55
		int rbin=1, rem, bin=0;
		while(dec!=0) {
			rem=dec%2;
			rbin=rbin*10+rem;
			dec/=2;
		}
		while(rbin!=1) {
			bin=bin*10+(rbin%10);
			rbin/=10;
		}
		
		
		
		
		
		System.out.println("Binary Value: "+bin);
	}
}

package com.example.J2SE.loops;

import java.util.Scanner;

public class BinToDec {
	public static void main(String[] args) {
		System.out.println("Enter a binary number: ");
		int bin = new Scanner(System.in).nextInt();//110111
		int dec=0;
		int mul=1;
		while(bin!=0) {
			dec+=(bin%10)*mul;
			mul*=2;
			bin/=10;
		}
		System.out.println("Decimal Value: "+dec);
	}
}

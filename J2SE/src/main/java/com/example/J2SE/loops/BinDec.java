package com.example.J2SE.loops;

import java.util.Scanner;

public class BinDec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		int bin, dec;
		do {
			System.out.println("Options: ");
			System.out.println("a. Binary to decimal");
			System.out.println("b. Decimal to binary");
			do {
				System.out.println("Choice: ");
				ch = sc.next().charAt(0);
			}while(!(ch=='a'||ch=='b'));
			if(ch=='a') {
				System.out.println("Enter a binary number: ");
				bin = sc.nextInt();//110111
				dec=0;
				int mul=1;
				while(bin!=0) {
					dec+=(bin%10)*mul;
					mul*=2;
					bin/=10;
				}
				System.out.println("Decimal Value: "+dec);
			}
			else {
				System.out.println("Enter a decimal number: ");
				dec = sc.nextInt();//55
				int rbin=1, rem;
				bin=0;
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
			
			do {
				System.out.println("Do you want to continue(y/n)? \n : ");
				ch = sc.next().charAt(0);
			}while(!(ch=='y'||ch=='n'));
			
			
			
			
		}while(ch=='y');
		
		
	}
}

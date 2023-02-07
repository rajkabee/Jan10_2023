package com.example.J2SE.loops;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int num = new Scanner(System.in).nextInt();//12345
		int temp = num;
		int rev=0, rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println("The reverse: "+rev);
		if(temp==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println(" not a Palindrome");
		}
	}
}

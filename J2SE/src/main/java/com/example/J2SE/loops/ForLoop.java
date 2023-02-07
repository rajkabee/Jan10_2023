package com.example.J2SE.loops;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		int i ;		
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		
		for(i=1; i<=10; i++) {	//for(initialization; condition; iteration)
			System.out.println(num+" x "+i+" = "+(num*i));			
		}
	}
}

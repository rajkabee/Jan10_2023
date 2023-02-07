package com.example.J2SE.conditionals;

import java.util.Scanner;

public class IfElseStatement {
	public static void main(String[] args) {
		System.out.println("How old are you?");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<18) {
			System.out.println("You are a minor!");
			System.out.println("You may not Enter the cinema!");
		}
		else if(age>=60) {
			System.out.println("Welcome to QFX Cinemas!");
			System.out.println("You get special discount of 30%.");
		}
		else {
			System.out.println("Welcome to QFX Cinemas!");
			System.out.println("You have to pay the full price!");
		}
		
		
	}
}

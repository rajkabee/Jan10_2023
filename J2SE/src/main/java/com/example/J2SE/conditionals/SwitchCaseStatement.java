package com.example.J2SE.conditionals;

import java.util.Scanner;

public class SwitchCaseStatement {
	
	public static void main(String[] args) {
		System.out.println("Cafe Menu");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccino");
		System.out.println("d. Hot Chocolate");
		System.out.println("Choice: ");
		char ch = new Scanner(System.in).next().charAt(0);
		switch(ch) {
		case 'a':
			System.out.println("Americano is served!");
			break;
		case 'b':
			System.out.println("Mochaccino is served!");
			break;
		case 'c':
			System.out.println("Cappuccino is served!");
			break;
		case 'd':
			System.out.println("Hot Chocolate is served!");
			break;
		default:
			System.out.println("Invalid Chioce!");
		}
	}
	
}

package com.example.J2SE.methods;

import java.util.Scanner;

public class PrimeComposite {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		boolean isPrime = prime(num);
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Composite");
		}
	}
	static boolean prime(int n){
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}

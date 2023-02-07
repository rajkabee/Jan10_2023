package com.example.J2SE.nestedLoops;

public class PrimeNumbers {
	public static void main(String[] args) {
		int n;
		for(n=2; n<101; n++) {
			int i, flag=0;
			for(i=2; i<=n/2; i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n);
			}
		}
		
	}
}

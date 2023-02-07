package com.example.J2SE.nestedLoops;

public class Factorials {
	
	public static void main(String[] args) {
		int n;
		for(n=1; n<=10; n++) {
			int res=1;
			for(int i=1; i<=n;i++ ) {
				res*=i;
			}
			System.out.println("factorial of "+n+": "+res);
		}
		
	}
}

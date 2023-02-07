package com.example.J2SE.loops;

public class ContinueStatement {
	public static void main(String[] args) {
		for(int i=0; i<30; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}

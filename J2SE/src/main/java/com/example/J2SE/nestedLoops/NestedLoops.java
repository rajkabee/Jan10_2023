package com.example.J2SE.nestedLoops;

public class NestedLoops {
	public static void main(String[] args) {
		System.out.println("Rectangle: ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Triangle 1: ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Triangle 2: ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Triangle 3: ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("   ");
			}
			for(int j=0; j<5-i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Triangle 4: ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print("   ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Pyramid: ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print("   ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*  ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Diamond: ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print("   ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*  ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("   ");
			}
			for(int j=0; j<4-i; j++) {
				System.out.print("*  ");
			}
			for(int j=0; j<3-i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
	}
}

package com.example.J2SE.arrays;

public class ArrayInJava {
	public static void main(String[] args) {
		int num[] = {45, 34, 78, 12, 29};
		int[] arr = new int[3];
		
		arr[0] = 123;
		arr[1] = 456;
		arr[2] = 789;
		
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
	}
}

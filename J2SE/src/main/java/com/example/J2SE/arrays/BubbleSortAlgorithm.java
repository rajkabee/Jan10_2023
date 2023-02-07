package com.example.J2SE.arrays;

public class BubbleSortAlgorithm {
	public static void main(String[] args) {
		int num[] = {5, 4, 3, 2, 1};
		int temp;
		for(int i=1; i<num.length; i++) {
			for(int j=0; j<num.length-i; j++) {
				if(num[j]>num[j+1]) {
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
				for(int k=0; k<num.length; k++) {
					System.out.print(num[k]+"\t");
				}
				System.out.println();
			}
		}
		
	}
}

package com.example.J2SE.arrays;

import java.util.Scanner;

public class MatrixMulVariableOrder {
	public static void main(String[] args) {
		System.out.println("Enter the order of the first matrix: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("by");
		int b = sc.nextInt();
		System.out.println("Enter the order of the second matrix: ");
		int c = sc.nextInt();
		System.out.println("by");
		int d = sc.nextInt();
		if(b!=c) {
			System.out.println("The matrices cannot be multiplied!");
		}
		else {
			int[][] x = new int[a][b];
			int[][] y = new int[c][d];
			int[][] p = new int[a][d];
			int i,j,k;
			System.out.println("Enter the elements in the first matrix: ");
			for(i=0; i<a; i++) {
				for(j=0; j<b; j++) {
					x[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			
			System.out.println("Enter the elements in the second matrix: ");
			for(i=0; i<c; i++) {
				for(j=0; j<d; j++) {
					y[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			
			System.out.println("First Matrix:");
			for(i=0; i<a; i++) {
				for(j=0; j<b; j++) {
					System.out.print(x[i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println("Second Matrix:");
			for(i=0; i<c; i++) {
				for(j=0; j<d; j++) {
					System.out.print(y[i][j]+"\t");
				}
				System.out.println();
			}
			
			for(i=0; i<a; i++) {
				for(j=0; j<d; j++) {
					p[i][j]=0;
					for(k=0; k<b; k++) {
						p[i][j]+=x[i][k]*y[k][j];
					}
				}
			}
			System.out.println("Product Matrix: ");
			for(i=0; i<a; i++) {
				for(j=0; j<d; j++) {
					System.out.print(p[i][j]+"\t");
					}
				System.out.println();
			}
		}
		
	}
}

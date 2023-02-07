package com.example.J2SE.arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b = {{9,8,7},{6,5,4}};
		int[][] sum = new int[2][3];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}

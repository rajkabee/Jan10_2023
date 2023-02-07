package com.example.J2SE.loops.practice;

import java.util.Scanner;

public class HcfLcm {
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int tempa=a;
		int tempb=b;
		int rem;
//		int hcf = a;
//		while(!(a%hcf==0  && b%hcf==0)) {
//			hcf--;
//		}
		while(a%b!=0) {
			rem=a%b;
			a=b;
			b=rem;
		}
		int hcf=b;
		System.out.println("HCF: "+hcf);
		
		int lcm = (tempa*tempb)/hcf;
		System.out.println("LCM: "+lcm);
		
		
	}
}

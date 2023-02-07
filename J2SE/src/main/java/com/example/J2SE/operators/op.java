package com.example.J2SE.operators;

public class op {
	/*
	 
	 Operators
	 	= assignment operator
	 Arithmetic operators
	 	+	int a=5+2;		// a=5; b=7; a=b;
	 	-
	 	/
	 	* 
	 	%	modulus -> a=10%7;	
	 	
	 	Combination operator
	 		a=7; a=a+5; a+=5;
	 		+=
	 		-=
	 		/=
	 		*=
	 		%=	a=10; a=a%7; a%=7;
	 	increment/decrement operators
	 	++	a=5; a=a+1; a+=1; a++; ++a;
	 	--
	 	
	 Bitwise operator
	 
	 Logical Operator
	 	AND
	 	OR
	 	NOT
	 	XOR
	 	
	 	A	B	A&&B	A||B	A^B
	 	0	0	0		0		0
	 	0	1	0		1		1
	 	1	0	0		1		1
	 	1	1	1		1		0
	 	
	 	A	!A
	 	0	1
	 	1	0
	 	
	 */
	
	public static void main(String[] args) {
		int a=5;
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		a+=1;
		System.out.println(a);
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		int b=a++;	//post increment
		System.out.println("b: "+b);
		System.out.println("a: "+a);
		b = ++a;	//pre increment
		System.out.println("b: "+b);
		System.out.println("a: "+a);
	}
}

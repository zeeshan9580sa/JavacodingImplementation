package com.basicNumberProgramming;

public class SwappingNumber {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c;
		System.out.println("Before swapping th num,ber isd  "+a +" & " +b);
		// Logic 1 with using third variable
		c=b;
		b=a;
		a=c;
		System.out.println("Before swapping th num,ber isd  "+a +" & " +b);
		System.out.println("---------------------------------------------");
		// Logic 2 without using third variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Before swapping th num,ber isd  "+a +" & " +b);
		System.out.println("----------------------------------------------");
		// Logic 3 with using * and / 
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Before swapping th num,ber isd  "+a +" & " +b);
		
	
	}

}

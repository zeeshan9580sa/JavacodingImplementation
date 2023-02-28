package com.basicNumberProgramming;

import java.util.Scanner;

public class TestcallforLogic {
	public static void main(String[] args) {
		
		ReveresNumber re= new ReveresNumber();
		int reversNumber =re.revNum1(1345);
		System.out.println(reversNumber);
		Palindrom pl=new Palindrom();
		System.out.println("Please enter you number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pl.isPalindrom(n);

	}
}

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
		ResversString  r= new ResversString();
		System.out.println("Please enter your String ");
		String userInput=sc.next();
		System.out.println(r.revString(userInput));
		PalindromString plS=new PalindromString();
		plS.isPalindrom(userInput);
		//System.out.println();

	}
}

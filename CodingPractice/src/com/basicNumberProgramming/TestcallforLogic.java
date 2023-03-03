package com.basicNumberProgramming;

import java.util.Scanner;

public class TestcallforLogic {
	public static void main(String[] args) {
		System.out.println("------Reverese Number ----------");
		ReveresNumber re= new ReveresNumber();
		int reversNumber =re.revNum1(1345);
		System.out.println(reversNumber);
		System.out.println("-------------Check Weather Number is Palindrome or Not--------");
		Palindrom pl=new Palindrom();
		System.out.println("-----------------Please enter you number---------------------");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pl.isPalindrom(n);
		DigitCounter dg=new DigitCounter();
		System.out.println("-------------Reverse A String-----------");
		ResversString  r= new ResversString();
		System.out.println("Please enter your String ");
		String userInput=sc.next();
		System.out.println(r.revString(userInput));
		PalindromString plS=new PalindromString();
		plS.isPalindrom(userInput);
		System.out.println("--------------NUmber is Even Or Odd-------------");
		//System.out.println();
		EvenOddNumber ed=new EvenOddNumber();
		ed.isEvenorOdd(n);
		System.out.println("-----------Count Even and Odd Digit-------------");
		CountEvenOddDigit count=new CountEvenOddDigit();
		count.countDigit(n);
		System.out.println("------------Sum Of Digit--------------");
		SumOfDigit sod=new SumOfDigit();
		System.out.println(sod.sumOfDigit(n));
		System.out.println("-----------Find the larget number of given number----------");
		LargestNumberAmong3 Ln=new LargestNumberAmong3();
		int larsteNumber =Ln.largestNumber(13,24,33);
		System.out.println(larsteNumber);
	}
}

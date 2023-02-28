package com.basicNumberProgramming;

public class ReveresNumber {

	public int  revNum1(int n) {
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
	}


}

package com.basicNumberProgramming;

public class SumOfDigit {
	public  int sumOfDigit(int n)
	{
		int rem;
		int sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
}

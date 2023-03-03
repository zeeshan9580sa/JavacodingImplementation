package com.basicNumberProgramming;

public class CountEvenOddDigit {
	
	public void countDigit(int n)
	{
		
		int evenDigit=0;
		int oddDigit=0;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			if(rem%2==0)
			{
				evenDigit++;
			}
			else
			{
				oddDigit++;
			}
			n=n/10;
		}
		System.out.println("Even digit are : "+evenDigit+"   And   Odd digit are  :   "+oddDigit);
		
	}
}

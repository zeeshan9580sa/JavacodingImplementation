package com.basicNumberProgramming;

public class DigitCounter {
	
	public int countDigit(int n)
	{
		int digit=0;
		while(n!=0)
		{
			n=n/10;
			digit++;
		}
		return digit;
		
	}

}

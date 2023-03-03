package com.basicNumberProgramming;

public class LargestNumberAmong3 {

	public int largestNumber(int a,int b,int  c)
	{
		if(a>b && a>c)
		return a;
		else if (b<a && b<c)
		return b;
		else
		return c;
		
	}
}

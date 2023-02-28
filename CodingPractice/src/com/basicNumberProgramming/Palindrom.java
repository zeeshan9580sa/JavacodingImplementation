package com.basicNumberProgramming;

public class Palindrom {
	
	public void isPalindrom(int userInput)
	{
		int num=userInput;
		int rev=0;
		while(userInput!=0)
		{
			rev=rev*10+userInput%10;
			userInput=userInput/10;
		}
		
		if(rev==num)
		{
			System.out.println("Number is Palindrom");
		}
		else
		{
			System.out.println("Number is not Palindrom");
		}
		
	}

}

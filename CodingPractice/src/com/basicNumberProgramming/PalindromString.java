package com.basicNumberProgramming;

public class PalindromString {
	public void isPalindrom(String u)
	{
		String orig=u;
		String revStr = "";
		char ch;
		for(int i=0; i<u.length();i++) {
			ch=u.charAt(i);
			revStr=ch+revStr;
		}
		//return revStr;
		if(u==orig)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not a palindrom");
		}
	}

}

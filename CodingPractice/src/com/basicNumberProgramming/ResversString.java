package com.basicNumberProgramming;

public class ResversString {

	public String revString(String s)
	{
		String revStr = "";
		char ch;
		for(int i=0; i<s.length();i++) {
			ch=s.charAt(i);
			revStr=ch+revStr;
		}
		return revStr;
		
	}
	
	public void isPalindrom(String u)
	{}
}

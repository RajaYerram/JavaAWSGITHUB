package com.prox.practice;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		long num = s.nextLong();
		String strorg = String.valueOf(num);
		String strrev = "";
		int len = strorg.length();
		for(int i = len-1;i>=0;i--)
		{
			strrev = strrev + strorg.charAt(i);
		}
		if(strorg.equals(strrev)){
			System.out.println("The number is a palindrome");
		}
		else{
			System.out.println("The number is not a palindrome");
		}
		s.close();
		
	}

}



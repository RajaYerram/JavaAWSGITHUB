package com.prox.training;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		int i;
		String even = " ";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		for(i=1;i<=n;i++)
		if(i%2==0)
		{
			even = even + i + " ";
		}
		System.out.println("The even numbers till "+n+" are:");
		System.out.println(even);
		
			
		
	}

}

package com.prox.training;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0,b=1,c;
		System.out.println("Enter a number for Finonacci series:"); 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("The fibonacci series upto "+n+" is:");
		System.out.print(a+" "+b);
		for(int i=2;i<n;i++)
		{
			c = a + b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
		

	}

}

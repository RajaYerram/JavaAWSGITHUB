package com.prox.training;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args){
		int i;
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
	    i=scan.nextInt();
		if(i%2==0)
		{
			System.out.println(i+" is even");
		}
		else
		{
			System.out.println(i+" is odd");
		}
	}
}

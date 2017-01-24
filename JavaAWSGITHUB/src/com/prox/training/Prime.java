package com.prox.training;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int i,n;
		int num;
		String primeNumbers = " ";
		System.out.println("Enter a range:");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(i=1;i<=n;i++)
		{
			int counter = 0;
			for(num=1;num>=1;num--)
			{
				if(i%num==0)
				{
					counter = counter+1;
				}
			}	
			if(counter==2)
			{
				primeNumbers = primeNumbers + i + " ";
			}
			
		}
	System.out.println("The prime numbers between 1 and " +n+ " are:");
	System.out.println(primeNumbers);
	
}
		
}

package com.prox.practice.caltask;

import java.util.Scanner;

public class SciCalc{
	
	public void display(){
		System.out.println("Thank you for choosing SC option");
		System.out.println("Press 1 for sum");
		System.out.println("Press 2 for product");
		Scanner s = new Scanner(System.in);
		int in = s.nextInt();
		if(in==1){
			System.out.println("Enter the value for a:");
			int a = s.nextInt();
			System.out.println("Enter the value for b:");
			int b = s.nextInt();
			int c = sum(a,b);
			System.out.println("The sum is:" +c);
		}
		else if(in==2){
			System.out.println("Enter the value for a:");
			int a = s.nextInt();
			System.out.println("Enter the value for b:");
			int b = s.nextInt();
			int c = product(a, b);
			System.out.println("The product is:"+c);
			s.close();
		}
		
	}
	
	public int sum(int a,int b){
		return a+b;
	}
	
	public int product(int a,int b){
		return a*b;
	}
}

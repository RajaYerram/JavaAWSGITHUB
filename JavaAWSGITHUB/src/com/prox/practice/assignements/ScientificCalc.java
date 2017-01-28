package com.prox.practice.assignements;

public class ScientificCalc extends Calculator {
	
	public ScientificCalc(){
		System.out.println("This is Scientific Calculator");
	}
	
	public int sum(int a,int b){
		return a+b;
	}
	
	public int product(int a,int b){
		System.out.println("This is child's product");
		return a*b;
	}
	public int square(int a){
		return a*a;
	}
	public int cube(int a){
		return a*a*a;
	}

}

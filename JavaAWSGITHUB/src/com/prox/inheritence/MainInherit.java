package com.prox.inheritence;

public class MainInherit {
	
	public static void show(){
		System.out.println("show");
	}
	
	//checking constructor chaining concept

	public static void main(String[] args) {
		show(); //static methods can call only static methods.  
		Languages a = new Languages();
		System.out.println("Languages Budget");
		System.out.println("Min " + a.getMinBudget());
		System.out.println("Max "+ a.getMaxBudget());
		Math b = new Math();
		System.out.println("Math Budget");
		System.out.println("Min " + b.getMinBudget());
		System.out.println("Max " + b.getMaxBudget());
		//super keyword example
		b.logsIn();
		Science c = new Science();
		System.out.println("Science Budget");
		System.out.println("Min " + c.getMinBudget());
		System.out.println("Max " + c.getMaxBudget());
		System.out.println();
	}

}

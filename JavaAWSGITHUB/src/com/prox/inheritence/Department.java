package com.prox.inheritence;


public class Department {

	public int getBudget(){

		return 500;

	}
	//to check "super" functionality
	public void logsIn(){
		System.out.println("Logged into System 2");
	}
	
	public Department(){
		System.out.println("I'm in Department class constructor");
	}

	

}
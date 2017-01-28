package com.prox.inheritence;

public class Math extends Department{



	public int budget = 500;

	

	public int getMinBudget(){

		return budget;

	}

	

	public int getMaxBudget(){

		return budget + getBudget();

	}
	
	@Override
	public void logsIn(){
		System.out.println("Logged into System 1");
		super.logsIn();
	}
	
	public Math(){
		System.out.println("I'm in Math class constructor");
	}

	

}
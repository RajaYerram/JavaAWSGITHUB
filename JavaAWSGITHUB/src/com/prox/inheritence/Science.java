package com.prox.inheritence;

public class Science extends Department{



	public int budget = 1000;

	

	public int getMinBudget(){

		return budget;

	}

	

	public int getMaxBudget(){

		return budget + getBudget();

	}

	

}

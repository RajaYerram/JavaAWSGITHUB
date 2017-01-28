package com.prox.practice.sample;

public enum Denomination {

	NICKLE(5),
	DIME(10),
	QUARTER(25);
	
	private Denomination(int val){
		this.denominationValue = val;
	}
	
	private int denominationValue;
	
	public int getDenominationValue() {
		return denominationValue;
	}
	
	public void setDenominationValue(int denominationValue) {
		this.denominationValue = denominationValue;
	}
}

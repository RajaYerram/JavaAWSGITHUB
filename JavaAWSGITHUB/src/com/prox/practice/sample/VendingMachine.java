package com.prox.practice.sample;

public class VendingMachine {
	
	private Denomination denomination;
	
	public Denomination getDenomination() {
		return denomination;
	}

	public void setDenomination(Denomination denomination) {
		this.denomination = denomination;
	}


	public static void main(String[] args) {
		
		VendingMachine vm = new VendingMachine();
		vm.setDenomination(Denomination.DIME);
		System.out.println(vm.getDenomination().getDenominationValue());
		for(Denomination dem : Denomination.values())
		{
			System.out.println(dem.name());
			System.out.println(dem.getDenominationValue());
		}
		
		
		
		
	}

}

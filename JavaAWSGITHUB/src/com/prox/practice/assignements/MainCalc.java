package com.prox.practice.assignements;

public class MainCalc {

	public static void main(String[] args) {
		ScientificCalc a = new ScientificCalc();
		System.out.println(a.sum(5, 10));
		System.out.println(a.product(2, 4, 6));
		
		Calculator b = new ScientificCalc();
		System.out.println(b.difference(10, 5));
		
		System.out.println(((ScientificCalc)b).square(5));
		System.out.println(((ScientificCalc)b).cube(2));
		

	}

}

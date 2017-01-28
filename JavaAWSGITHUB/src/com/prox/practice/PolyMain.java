package com.prox.practice;

public class PolyMain {
	
	public static void main(String[] args) {
		
		PolymorphicVariable p = new PolyBase();
		p.show();//here it calls PolyBase method
		test(p);
	
	}

	public static void test(PolymorphicVariable p){
		if(p instanceof PolyBase)// checks if p is the object of PolyBase class
		((PolyBase)p).display(); 
	}
}

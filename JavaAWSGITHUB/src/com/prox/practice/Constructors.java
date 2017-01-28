package com.prox.practice;

public class Constructors extends com.prox.inheritence.Math{

	public static void main(String[] args) {
		
		//If we write our own constructors, JVM doesn't provide default constructor.
			
		Book1 b1 = new Book1();
		b1.setTitle("Programming");
		b1.setAuthor("Mark");
		b1.setPrice(10.2);
		b1.setLocation("Dallas");

		Book1 b2 = new Book1("Algorithms", "Dietel");

		Book1 b3 = new Book1("Coding", "Richie", 10.25);

		Book1 b4 = new Book1("Java", "Dennies", 15.45, "Illinois");

		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println(b1);

	}
}

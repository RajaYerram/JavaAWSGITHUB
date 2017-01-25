package com.prox.practice;

public class Strings {
	
	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book();
		books[0].setBookName("Programming");
		books[0].setAuthorName("Raja");
		
		books[1] = new Book();
		books[1].setBookName("Machine Learning");
		books[1].setAuthorName("Shreya");
		
		books[2] = new Book();
		books[2].setBookName("AWS");
		books[2].setAuthorName("Yerram");
		
		System.out.println(books[0].getBookName());
		System.out.println(books[0].getAuthorName());
		
		System.out.println(books[1].getBookName());
		System.out.println(books[1].getAuthorName());
		
		
		
	}

}

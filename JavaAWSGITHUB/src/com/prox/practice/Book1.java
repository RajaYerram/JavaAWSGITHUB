package com.prox.practice;

public class Book1 {
	
	private String title;
	private String author;
	private double price;
	private String location;
	
	public Book1(){
		
	}
	
	public Book1(String title, String author, double price, String location){
		this.title = title;
		this.author = author;
		this.price = price;
		this.location = location;
	}

	public Book1(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public Book1(String title, String author, double price){
		this(title, author);
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	// for toString goto, Source --> Generate toString()
	@Override
	public String toString() {
		return "Book1 [title=" + title + ", author=" + author + ", price=" + price + ", location=" + location + "]";
	}
	
	
	
	
}

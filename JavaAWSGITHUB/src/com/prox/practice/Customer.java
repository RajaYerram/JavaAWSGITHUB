package com.prox.practice;

public class Customer {

	String customerID;
	String name;
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Customer(String customerID, String name) {
		super();
		this.customerID = customerID;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj){
		Customer c = (Customer)obj;
		
		return this.getCustomerID().equals(c.getCustomerID()) && this.getName().equals(c.getName()) ;
	}
	
	
	
}

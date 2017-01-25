package com.prox.practice;

public class Employee {
	
	private String fName;
	private String lName;
	public static final String COMPANY = "Google";
	private String fullName;
	private String designation;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getFullName() {
		return givemeFullName(fName, lName);
	}
	 
	public static String givemeFullName(String x, String y){
		return x + " " + y;
	}
	
	

}

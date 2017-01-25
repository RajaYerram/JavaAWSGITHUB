package com.prox.practice;

public class StaticDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setfName("Raja");
		e1.setlName("Yerram");
		e1.setDesignation("Java Developer");
		System.out.println(e1.getFullName());
		System.out.println(e1.getDesignation());
		System.out.println(Employee.COMPANY);
		

	}

}

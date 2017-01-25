package com.prox.practice;

public class StaticDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setfName("Raja");
		e1.setlName("Yerram");
		e1.setDesignation("Java Developer");
		System.out.println(e1.getFullName());
		System.out.println(e1.getDesignation());
		// Static variables can be called by Class Name.
		// Static-Final combo naming convention is capital
		// Final variables needs initialization when declared and the value never changes.
		System.out.println(Employee.COMPANY);
		

	}

}

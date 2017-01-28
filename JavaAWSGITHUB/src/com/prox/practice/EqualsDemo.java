package com.prox.practice;

public class EqualsDemo {

		public static void main(String[] args) {
			//s,s1 -> Hello (String pool)
			//s2 -> Hello(Heap) , s3 -> Hello(Heap)
			String s = "Hello";
			String s1 = "Hello"; //literal
			String s2 = new String("Hello"); //object
			String s3 = new String("Hello");
			System.out.println(s==s1); 
			System.out.println(s==s2);
			System.out.println(s2==s3);
			System.out.println(s.equals(s1));
			System.out.println(s1.equals(s2));
			System.out.println(s2.equals(s3));
			
			Customer c = new Customer("c_123","Raja");
			Customer c1 = new Customer("c_123", "Raja");
			System.out.println(c==c1);
			System.out.println(c.equals(c1));
			
		}
}

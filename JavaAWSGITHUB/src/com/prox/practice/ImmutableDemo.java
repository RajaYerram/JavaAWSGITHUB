package com.prox.practice;

public class ImmutableDemo{
	
	public static void main(String[] args) {
	//Strings are immutable in nature.
	//When we try to modify a srting, it creates a new string instead.
	//meomory gets wasted
	String s = "Hello";
	s = s.concat(" World");
	System.out.println(s);
	
	//mutable strings
	// 1 -> String Buffer - Thread safe(used in Mutli-Threading)
	StringBuffer sb = new StringBuffer("Hello");
	sb.append(" Great");
	sb.append(" World");
	String s1 = sb.toString();
	System.out.println(s1);
	
	// 2 -> String Builder - Not thread safe
	StringBuilder sbr = new StringBuilder();
	sbr.append("Hello");
	sbr.append(" World");
	String s3 = sbr.toString();
	System.out.println(s3);
	
	//Methods in String
	StringBuffer s2 = new StringBuffer("Hello");
	System.out.println(s2.reverse());
	String s4 = "Hello";
	
	//toCharArray
	char [] c = s4.toCharArray();
	System.out.println(c);
	
	//length
	System.out.println(s4.length());
	
	//substring
	String s5 = s4.substring(0, 3);
	System.out.println(s5);
	
	//charAt 
	System.out.println(s4.charAt(1));
	
	//indexOf
	System.out.println(s4.indexOf('l'));
	
	//lastIndexOf
	System.out.println(s4.lastIndexOf('l'));
	
	String s6 = "Hello World How Are You";
 	String [] words = s6.split(" ");
 	for (String string : words) {
 		
 		System.out.println(string);
	}
 	
 	//covereting int to String
 	String val = String.valueOf(10);
 	System.out.println(val);
	
 	//Trim removes starting and ending spaces
	String x = " Hello World ";
	System.out.println(x.trim());
	}
}

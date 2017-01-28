package com.prox.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		System.out.println(d);
		//changing format
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = sdf.format(d);
		System.out.println(formattedDate);
		
		String s = "2017-04-28";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date d3 = sdf1.parse(s);
		System.out.println(d3);
		
	}
}

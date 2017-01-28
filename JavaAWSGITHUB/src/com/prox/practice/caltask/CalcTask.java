package com.prox.practice.caltask;

import java.util.Scanner;

public class CalcTask {
	

	public static void main(String[] args) {
		
		SciCalc c = new SciCalc();
		Scanner s = new Scanner(System.in);
		System.out.println("Press 1 for SC Calc");
		System.out.println("Press 2 for R Calc");
		int a = s.nextInt();
		if(a==1)
		{
			c.display();
		}
		s.close();

		
		

	}

}

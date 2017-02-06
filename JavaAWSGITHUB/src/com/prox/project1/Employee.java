package com.prox.project1;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Employee {

	
	public int empID;
	public String empName;
	public int salary;
	Scanner s = new Scanner(System.in);
	Scanner st = new Scanner(System.in);
	public Employee(int empID, String empName, int salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		File f=new File("C:\\StoreFront\\Employee");
		boolean f2=true;
		if(!f.exists())
			f2=f.mkdirs();
		if(f2)
		{
			try {
				File f1=new File("C:\\StoreFront\\Employee\\"+empID+".txt");
				f1.createNewFile();

				BufferedWriter bw = null;
				FileWriter fw = null;

				try {

					String contentName = "Name: "+empName;
					String contentSalary="Salary: "+salary;
					//System.out.println(content);
					fw = new FileWriter(f1);
					bw = new BufferedWriter(fw);
					bw.write(contentName);
					bw.newLine();
					bw.write(contentSalary);
					bw.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}


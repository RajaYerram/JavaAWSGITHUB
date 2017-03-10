package com.prox.training.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.sun.org.apache.xml.internal.utils.SerializableLocatorImpl;

public class TestSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Student s1 = new Student(1, "Raja", 23);
		File f = new File("Y:\\Proximate - AWS\\1.txt");
		
		ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream(f));
		fos.writeObject(s1);
		fos.close();
		
		System.out.println("Data written succesfully");
		
	}
}
		
		
		class Student implements Serializable{
		
		int id;
		String name;
		int age;
		
		public Student(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		
		
}



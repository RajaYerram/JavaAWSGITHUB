package com.prox.practice;

public class InstanceInitializers {
	
	int x;
	static int y;
	//static block will be executed before Main Method
	static{
		y = y+20; //Static Initializer
		System.out.println(y); 
	}
	public InstanceInitializers(){
		
	}

	{
		x = x+10; //Instance Initializer
	}

	/**
	 *This is ELement Comment
	 */
	public static void main(String[] args) {

		InstanceInitializers i = new InstanceInitializers();
		System.out.println(i.x);
		System.out.println(InstanceInitializers.y);
	}

}

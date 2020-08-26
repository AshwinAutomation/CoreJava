package com.oop.nonstaticmember;

public class Example1 {
	int x = 10;
	int y = 20;


	public Example1() {
		System.out.println("default construtor");
	}
	{
		System.out.println("NSB");
	}
	void m1() {
		System.out.println("non-static method");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method");
		Example1 e1=new Example1();
		System.out.println(e1);
		
		
		
		
	}
}
//Main method 
//NSB
//default constructor
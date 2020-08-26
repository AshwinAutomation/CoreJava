package com.oop.nonstaticmember;

public class Example3 {
	int x = 10;
	int y = 20;


	public Example3() {
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
		Example3 e1=new Example3();
		System.out.println(e1);
		
		
		
		
	}
}
//Main method 
//NSB
//default constructor
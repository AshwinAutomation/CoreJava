package com.oop.nonstaticmember;

public class Example2 {
	int x = 10;
	int y = 20;


	public Example2() {
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
		Example2 e1=new Example2();
		Example2 e2=new Example2();
		System.out.println(e1);
		
		System.out.println(e1.x + "=======" + e1.y);
		

		System.out.println(e2.x + "=======" + e2.y);
		e2.x=50;
		e2.y=60; 
		
		System.out.println(e2.x + "=======" + e2.y);
	}
}
/* 
 main method
NSB
default construtor
NSB
default construtor
com.oop.nonstaticmember.Example2@7852e922
10=======20
10=======20
50=======60
*/
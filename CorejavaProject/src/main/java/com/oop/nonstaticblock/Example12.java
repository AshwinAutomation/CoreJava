package com.oop.nonstaticblock;

public class Example12 {
static Example12 e=new Example12();

	public Example12() {
		System.out.println("constructor");

	}
    public static void main(String[] args) {
		System.out.println("main");
		Example12 e = new Example12();
		System.out.println("main end");
	}
    
    
}
//output
//constructor
//main
//constructor
//main end
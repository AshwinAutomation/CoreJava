package com.oop.nonstaticblock;

public class Example10 {

	static {

		System.out.println("SB");
		Example10 e = new Example10();
	}

	public Example10() {
		System.out.println("constructor");

	}
    public static void main(String[] args) {
		System.out.println("main");
		Example10 e = new Example10();
		System.out.println("main end");
	}
    
    
}
//output
//SB
//constructor
//main
//constructor
//main end
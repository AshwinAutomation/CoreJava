package com.oop.nonstaticblock;

public class Example11 {

	 {

		System.out.println("SB");
		//Example11 e = new Example11();
	}

	public Example11() {
		System.out.println("constructor");

	}
    public static void main(String[] args) {
		System.out.println("main");
		Example11 e = new Example11();
		System.out.println("main end");
	}
    
    
}
//output
//main
//SB
//constructor
//constructor
//main end
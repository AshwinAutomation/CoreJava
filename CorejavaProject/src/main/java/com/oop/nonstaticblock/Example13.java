package com.oop.nonstaticblock;

public class Example13 {
 //Example13 e=new Example13();

	 Example13() {
		System.out.println("constructor");

	}
    public static void main(String[] args) {
		System.out.println("main");
		Example13 e = new Example13();
		System.out.println("main end");
	}
    
    
}
//output
//main
//constructor
//main end
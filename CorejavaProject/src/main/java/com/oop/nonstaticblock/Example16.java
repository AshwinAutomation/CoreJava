package com.oop.nonstaticblock;

public class Example16 {
	
	int x=m1();
	int m1() {
		System.out.println("NSV x");
		System.out.println("m1 end");
		return 10;
	}
 {
	
	System.out.println("NSB start");
	Example16 e=new Example16();
	System.out.println("NSB end");
	
}



	 Example16() {
		System.out.println("constructor start");
		System.out.println("constructor end");

	}
    public static void main(String[] args) {
		System.out.println("main");
		Example16 e = new Example16();
		System.out.println("main end");
	}
    
    
}

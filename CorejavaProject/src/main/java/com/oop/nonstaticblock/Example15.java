package com.oop.nonstaticblock;

public class Example15 {
static {
	
	System.out.println("SB start");
	Example15 e=new Example15();
	System.out.println("SB end");
	
}
{
	System.out.println("NSB start");
	System.out.println("NSB end");

}


	 Example15() {
		System.out.println("constructor start");
		System.out.println("constructor end");

	}
    public static void main(String[] args) {
		System.out.println("main");
		Example15 e = new Example15();
		System.out.println("main end");
	}
    
    
}
//output
//SB start
//NSB start
//NSB end
//constructor start
//constructor end
//SB end
//main
//NSB start
//NSB end
//constructor start
//constructor end
//main end
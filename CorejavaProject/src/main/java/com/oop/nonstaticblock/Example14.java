package com.oop.nonstaticblock;

public class Example14 {
static {
	
	System.out.println("SB start");
	Example14 e=new Example14();
	System.out.println("SB end");
	
}
{
	System.out.println("NSB start");
	System.out.println("NSB end");

}


	 Example14() {
		System.out.println("constructor start");
		System.out.println("constructor end");

	}
    public static void main(String[] args) {
		System.out.println("main");
		Example14 e = new Example14();
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
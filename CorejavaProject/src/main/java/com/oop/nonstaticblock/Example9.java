package com.oop.nonstaticblock;

public class Example9 {
public static void main(String[] args) {
	System.out.println("main start");
	Example9 e1=new Example9();
	System.out.println("object is created: " + e1);
	System.out.println("main end");
}


int x=m2();
int m2() {
	
	System.out.println("NSV x");
	return 50;
}


{
	System.out.println("NSB start");
	System.out.println("NSB end");
}

public Example9() {
	System.out.println("constructor start");
	//Example9 e=new Example9();
	System.out.println("constructor end");
}
}
//output

//main start
//NSV x
//NSB start
//NSB end
//constructor start
//constructor end
//object is created: com.oop.nonstaticblock.Example9@7852e922
//main end

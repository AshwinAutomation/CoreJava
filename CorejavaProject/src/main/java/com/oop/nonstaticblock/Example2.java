package com.oop.nonstaticblock;

public class Example2 {
	// non-static block
	{
		System.out.println("NSB");
	}

	// no-arg constructor
	public Example2() {
		super();
		System.out.println("No-arg constructor");
	}

	// string-arg constructor
	public Example2(String name) {
		super();
		System.out.println("String-arg constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		Example2 e1 = new Example2();
		System.out.println("print  of object e1 :" + e1);
		Example2 e2 = new Example2("ashwin");
		System.out.println("print  of object e2 :" + e2);
	}
	
	
	{
		System.out.println("NSB2");
	}
	
	
	
}
//output:
/*main
NSB
NSB2
no-arg constructor
print  of object e1 :com.oop.nonstaticblock.Example@hexadecimalValue
NSB
NSB2
string-arg constructor
print  of object e2 :com.oop.nonstaticblock.Example@hexadecimalValue*/
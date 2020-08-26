package com.oop.nonstaticblock;

public class Example {
	// non-static block
	{
		System.out.println("NSB");
	}

	// no-arg constructor
	public Example() {
		super();
		System.out.println("No-arg constructor");
	}

	// string-arg constructor
	public Example(String name) {
		super();
		System.out.println("String-arg constructor");
	}

	public static void main(String[] args) {
		System.out.println("main");
		Example e1 = new Example();
		System.out.println("print  of object e1 :" + e1);
		Example e2 = new Example("ashwin");
		System.out.println("print  of object e2 :" + e2);
	}
}
//output:main,NSB,no-arg constructor,print  of object e1 :com.oop.nonstaticblock.Example@hexadecimalValue,NSB,string-arg constructor,print  of object e2 :com.oop.nonstaticblock.Example@hexadecimalValue
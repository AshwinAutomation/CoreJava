package com.oop.construtor;

public class ConstructorOverloding {
	// No-argument constructor
	public ConstructorOverloding() {
		super();
		System.out.println("No-argument constructor");
	}

	// int-arg constructor
	public ConstructorOverloding(int x) {
		super();
		System.out.println("int-arg constructor");
	}

	// string-arg constructor
	public ConstructorOverloding(String x) {
		super();
		System.out.println("string-arg constructor");
	}

	public static void main(String[] args) {
		System.out.println("main");
		// invoking No-argument constructor
		ConstructorOverloding c1 = new ConstructorOverloding();
		System.out.println("hashcode of c1 object :" +c1);
		
		// invoking int-argument constructor
		ConstructorOverloding c2 = new ConstructorOverloding(10);
		System.out.println("hashcode of c2 object :" +c2);
		
		// invoking string-argument constructor
		ConstructorOverloding c3 = new ConstructorOverloding("Ashwin");
		System.out.println("hashcode of c3 object :" +c3);
	}

}

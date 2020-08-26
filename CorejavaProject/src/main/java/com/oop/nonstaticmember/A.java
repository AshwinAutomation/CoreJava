package com.oop.nonstaticmember;

public class A extends java.lang.Object {

	int x;

	A() {
		super();
		this.x = 10;
	}

	public static void main(String[] args) {

	}
}

class B extends A {
	int y;

	public B() {
		super();
		this.y = 20;
	}

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.x);
		System.out.println(b.y);

	}
}



package com.oop.nonstaticblock;

public class Example8 {
	void m1() {
		System.out.println("m1 start");
		m1();
		System.out.println("m1 end");

	}
	public static void main(String[] args) {
		System.out.println("main start");
		Example8 e = new Example8();
		System.out.println("object is created");
		e.m1();
		System.out.println("main end");
	}
	int x=m2();
	int m2() {
		System.out.println("NSV x");
		return 50;
	}
	public Example8() {
		System.out.println("constructor start");
		System.out.println("constructor end");
	}
}
//output: main start,NSV x,object created,m1 start,m1 start,m1 start,.......C.E
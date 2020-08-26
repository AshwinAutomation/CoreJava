package com.oop.nonstaticmember;

public class Sample3 {

	int x = 10;
	int y = 20;

	void setXY() {

		System.out.println("setXY");
		this.x = 50;
		this.y = 60;
	}

	void printXY() {
		System.out.println("x :" + this.x);
		System.out.println("y :" + this.y);
	}

	void m1() {
		setXY();
		printXY();
	}

	public static void main(String[] args) {
		Sample3 s1 = new Sample3();

		System.out.println("Main");
		s1.m1();
	}
}
//output :
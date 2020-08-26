package com.oop.nonstaticmember;

public class Sample2 {

	int x = 10;
	int y = 20;

	void m1() {

		System.out.println("m1");
	}

	void printXY() {
		System.out.println("x :" + this.x);
		System.out.println("y :" + this.y);
	}

	public static void main(String[] args) {
		Sample2 s1 = new Sample2();

		System.out.println("Main");
		s1.printXY();
		Sample2 s2 = new Sample2();
		s2.printXY();
	}
}
//output :
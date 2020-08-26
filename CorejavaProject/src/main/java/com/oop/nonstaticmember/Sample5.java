package com.oop.nonstaticmember;

public class Sample5 {

	int x = 10;
	int y = 20;

	void m1() {
		Sample5 s1 = new Sample5();
		s1.x = 50;
		s1.y = 60;
		System.out.println(s1.x + "***********" + s1.y);// 50*********60
	}

	public static void main(String[] args) {
		Sample5 s2 = new Sample5();
		System.out.println(s2.x + "***********" + s2.y);// 10*********20

		s2.m1();

		System.out.println(s2.x + "***********" + s2.y);// 10*********20
	}
}

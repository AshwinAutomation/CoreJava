package com.oop.nonstaticmember;

public class Sample8 {

	int x = 10;
	int y = 20;

	public void m1(Sample8 s) {
		System.out.println(x + "***********" + y);// 10*********20
		s.x = 5;
		s.y = 6;
		System.out.println("after object modification");
		System.out.println("inside m1 method :" +s.x + "***********" + s.y);// 5*********6

	}
	
	
	public static void main(String[] args) {
		
		Sample8 s1 = new Sample8();
		System.out.println(s1.x + "***********" + s1.y);// 10*********20
		
		Sample8 s2 = new Sample8();
		s1.m1(s2);
		System.out.println(s1.x + "***********" + s1.y); // 10*********20
		System.out.println(s2.x + "***********" + s2.y); // 5*********6
		
		
		s2.m1(s1);
		System.out.println(s1.x + "***********" + s1.y); // 5*********6
		System.out.println(s2.x + "***********" + s2.y); // 5*********6
	}
}

package com.oop.nonstaticmember;

public class Sample7 {

	int x = 10;
	int y = 20;

	public void m1(Sample7 s) {
		System.out.println(x + "***********" + y);// 10*********20
		this.x = 5;
		this.y = 6;
		System.out.println("after object modification");
		System.out.println("inside m1 method :" +x + "***********" + y);// 5*********6

	}
	
	
	public static void main(String[] args) {
		
		Sample7 s1 = new Sample7();
		System.out.println(s1.x + "***********" + s1.y);// 10*********20
		
		Sample7 s2 = new Sample7();
		s1.m1(s2);
		System.out.println(s1.x + "***********" + s1.y); // 5*********6
	}
}

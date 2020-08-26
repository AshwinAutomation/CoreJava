package com.oop.nonstaticmember;

public class Sample4 {

	int x = 10;
	int y = 20;

	void m1() {
		Sample4 s1=new Sample4();
		s1.x=50;
		s1.y=60;
	}
	

	public static void main(String[] args) {
		Sample4 s2 = new Sample4();
    System.out.println(s2.x+"***********"+s2.y);//10*********20
    
		s2.m1();
		  System.out.println(s2.x+"***********"+s2.y);//10*********20
	}
}

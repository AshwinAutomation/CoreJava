package com.oop.nonstaticmember;

public class Sample6 {

	int x = 10;
	int y = 20;

	public static void main(String[] args) {
		Sample6 s2 = new Sample6();
		System.out.println(s2.x + "***********" + s2.y);// 10*********20
		Sample6 s3 = new Sample6();
		System.out.println(s3.x + "***********" + s3.y); // 10*********20
		Sample6 s4 = s3;
		s4.x = 70;
		s4.y = 80;

		System.out.println(s3.x + "***********" + s3.y);  //70***********80

		System.out.println(s4.x + "***********" + s4.y); //70***********80


	}
}

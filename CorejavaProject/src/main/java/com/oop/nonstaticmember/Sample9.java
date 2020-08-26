package com.oop.nonstaticmember;

public class Sample9 {

	int x;
	int y;

	void m1(Sample9 s) {
		this.x = x + 1;
		this.y = y + 2;

		s.x = s.x + 3;
		s.y = s.y + 4;
	}

	public static void main(String[] args) {
		Sample9 s1 = new Sample9();
		Sample9 s2 = new Sample9();
		System.out.println(s1.x + "******" + s1.y);//0"********"0
		System.out.println(s2.x + "******" + s2.y);//0"********"0
		s1.m1(s2);
		System.out.println(s1.x + "******" + s1.y);//1"********"2
		System.out.println(s2.x + "******" + s2.y);//3"********"4
		
		s2.m1(s1);
		System.out.println(s1.x + "******" + s1.y);//4"********"6
		System.out.println(s2.x + "******" + s2.y);//4"********"4
		
		s1.m1(s1);
		System.out.println(s1.x + "******" + s1.y);//8*********12
		System.out.println(s2.x + "******" + s2.y);//4"********"6
		
		
		s2.m1(s2);
		System.out.println(s1.x + "******" + s1.y);//8******12
		System.out.println(s2.x + "******" + s2.y);//8******12
  	}
}

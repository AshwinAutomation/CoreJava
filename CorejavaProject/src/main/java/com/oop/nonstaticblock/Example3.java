package com.oop.nonstaticblock;

public class Example3 {
	int x = m1();

	int m1() {
		System.out.println("NSV x");
		return 50;
	}

	{
		System.out.println("NSB1");
	}

	private Example3() {
		System.out.println("no-arg constructor");
		this.x=80;
		this.y=90;
	}

	public static void main(String[] args) {
		System.out.println("main");
		Example3 e3 = new Example3();
		System.out.println("value of x : " +e3.x);//80
		System.out.println("value of y : " +e3.y);//90
	}

	{
		System.out.println("NSB2");
	}
	int y = m2();

	int m2() {
		System.out.println("NSV y");
		return 60;
	}

}
/*main
NSV x
NSB1
NSB2
NSV y
no-arg constructor
50
60
*/

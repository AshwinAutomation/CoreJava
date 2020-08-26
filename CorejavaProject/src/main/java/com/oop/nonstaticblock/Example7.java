package com.oop.nonstaticblock;

public class Example7 {
	int x = 10;

	{
		System.out.println("x :" + x);// 10
		// System.out.println(b);//exception: illegal forward reference
		System.out.println("y :" + getB());// 0
	}

	public static void main(String[] args) {
		Example7 e = new Example7();

		System.out.println(e.x);// 10
		System.out.println(e.y);// 20
	}

	int getB() {
		return y;
	}

	int y = 20;

}

package com.oop.staticblock;


public class StaticBlock6 {
	static int a = 10;

	static {
		System.out.println("from SB");
		System.out.println(" a : " + a);
	//	System.out.println(" b : " + b);
		System.out.println(" b : " + StaticBlock6.b);
	}

	public static void main(String[] args) {
		System.out.println("main");
	}

	static int b = 10;
}

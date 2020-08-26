package com.oop.staticblock;

public class StaticBlock8 {
	static int a = 10;

	static {
		System.out.println(" from SB");
		System.out.println(" a : " + a);
		System.out.println(" b : " + StaticBlock8.b);
		b = 50;
	}

	public static void main(String[] args) {
		System.out.println(" main ");
		System.out.println(" a : " + a);
		System.out.println(" b : " + b);
	}

	static int b = 10;
}

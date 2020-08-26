package com.oop.nonstaticblock;

public class Example17 {
	static Example17 e = new Example17();
	static {
		System.out.println("SB start");
		System.out.println("SB end");
	}
	 {
		System.out.println("NSB start");
		System.out.println("NSB end");
	}

	Example17() {
		System.out.println("constructor start");
		System.out.println("constructor end");
	}

	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("main end");
	}

}

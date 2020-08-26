package com.oop.nonstaticblock;

public class Example18 {
	static Example18 e = new Example18();
	static {
		System.out.println("SB start");
		System.out.println("SB end");
	}
	 {
		System.out.println("NSB start");
		System.out.println("NSB end");
	}

	Example18() {
		System.out.println("constructor start");
		System.out.println("constructor end");
	}

	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("main end");
	}

}

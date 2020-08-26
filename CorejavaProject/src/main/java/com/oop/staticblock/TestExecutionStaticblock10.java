package com.oop.staticblock;

public class TestExecutionStaticblock10 {

	static {
		System.out.println("test SB ");
	}

	public static void main(String[] args) {
		System.out.println("Test main");
		StaticBlock10.m1();
	}

}



//test SB
//Test Main
//static block10
//StaticBlock10 m1
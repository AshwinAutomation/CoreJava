package com.java.logicalprogram;

public class SwappingNumberWithoutExtraVariable {
	/*
	 * solve it using 3rd variable;
	 * 
	 * x=10; y=20; result: x=20,y=10
	 */

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println(x + "''''''''''" + y);// 10......20
		x=x+y;
		
		System.out.println(x + "''''''''''" + y);//30.........20
	
		y=x-y;
		
		System.out.println(x + "''''''''''" + y);//30.........10
		x=x-y;
		System.out.println(x + "''''''''''" + y);//20.........10
	}
	

	
	
	
	
}

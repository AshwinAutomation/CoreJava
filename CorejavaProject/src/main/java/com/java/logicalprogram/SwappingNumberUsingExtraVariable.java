package com.java.logicalprogram;

public class SwappingNumberUsingExtraVariable {
	/*
	 * solve it using 3rd variable;
	 * 
	 * x=10; y=20; result: x=20,y=10
	 */

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println(z);
		
		
		x=z-x;
		y=z-y;
		
		
		System.out.println(x);
		System.out.println(y);
	}
	

	
	
	
	
}

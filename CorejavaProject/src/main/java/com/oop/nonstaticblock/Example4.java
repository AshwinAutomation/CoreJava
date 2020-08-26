package com.oop.nonstaticblock;

public class Example4 {
	static int a=10;
	static {
		System.out.println(a);
		//System.out.println(b);//exception:illegal forward reference
		System.out.println(Example4.b);
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
	}
    static int b=20;
    
}

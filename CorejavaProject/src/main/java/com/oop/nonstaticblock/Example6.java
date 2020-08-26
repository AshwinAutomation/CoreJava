package com.oop.nonstaticblock;

public class Example6 {
	static int a=10;
	static
	 {
		System.out.println("a :" +a);//10
		//System.out.println(b);//exception:  illegal forward reference
		System.out.println("y :" + getB());//0
	}
	public static void main(String[] args) {
		System.out.println(a);//10
		System.out.println(b);//20
	}
	
	static int getB() {
		return b;
	}
    static int b=20;
    
}

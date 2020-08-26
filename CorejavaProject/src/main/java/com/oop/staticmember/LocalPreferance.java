package com.oop.staticmember;


public class LocalPreferance {
    static int a=10;
    static int b=20;
    
	public static void main(String[] args) {
		System.out.println(a + " " + b);//10,20 
		a=50;
		System.out.println(a + " " + b);//50 20 due to LocalPreferance
		
		//using className we can avoid variable shadowing
		
		System.out.println(LocalPreferance.a + " " + b);//10 20
	}
}

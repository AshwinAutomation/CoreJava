package com.oop.construtor;

public class Example1 {
	
	public Example1() {
		System.out.println("constructor");
	}
	
public static void main(String[] args) {
	System.out.println("main");
	Example1 e1=new Example1();
	System.out.println(e1);
}
}
//output:main,constructor,com.oop.construtor.Example1@7852e922
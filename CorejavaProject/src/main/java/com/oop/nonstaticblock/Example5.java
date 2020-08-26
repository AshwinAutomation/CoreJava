package com.oop.nonstaticblock;

public class Example5 {
	 int x=10;
	 {
		System.out.println("x :" +x);
		//System.out.println(b);//exception:illegal forward reference
		System.out.println("y :" + this.y);
	}
	public static void main(String[] args) {
		Example5 e=new Example5();
		System.out.println(e.x);
		System.out.println(e.y);
	}
     int y=20;
    
}

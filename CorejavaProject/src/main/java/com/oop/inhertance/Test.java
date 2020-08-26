package com.oop.inhertance;

public class Test {
public void t1() {
	System.out.println("test t1");
	
}
   public static void main(String[] args) {
	Test t=new Test();
	t.t1();
	
	 Child c= new Child();
	 c.m1();
	 c.m2();
	 Parent p = new Parent();
	 p.m1();
	 p.m2();
	 
}
}

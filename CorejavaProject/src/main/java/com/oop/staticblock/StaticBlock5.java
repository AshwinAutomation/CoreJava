package com.oop.staticblock;

public class StaticBlock5 {
 static int a=m1();
    
    static int m1() {
    	System.out.println("SV1:a");    	
    	return 10;
    }
    
    
   static {
		 System.out.println("1st SB");
   }
  
    static int b =m2();
    static int m2() {
    	System.out.println("SV2:b");    	
    	return 20;
    }
    
    static void m4() {
    	System.out.println("SM4");    	
    }

	
	
	public static void main(String[] args) {
     System.out.println("main");
	}
   static int c=m3();
    static int m3() {
    	System.out.println("SV3:c");  
    	return 30;
    }
	static {
		 System.out.println("2nd SB");
	}
	
}

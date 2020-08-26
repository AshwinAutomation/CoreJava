package com.oop.staticmember;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example3 {
	static Logger logger;

	static {
		logger = Logger.getLogger("Example3");
		PropertyConfigurator.configure("Log4j.properties");
	}
     static int a=m1();
     static int m1() {
    	 logger.info("m1:a");
    	 return 10;
     }
     static int m2() {
    	 logger.info("m2:b");
    	 return 20;
     }
	public static void main(String[] args) {
		 logger.info("main");
		 logger.info("a :" + a);
		 logger.info("b :" + b);
		 logger.info("c :" + c);
	}
	static int b;
	
	static int c=m2();
	
    static void m3() {
   	 logger.info("m3");
    }
}

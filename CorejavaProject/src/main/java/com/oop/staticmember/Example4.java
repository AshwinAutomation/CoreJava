package com.oop.staticmember;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example4 {
    static Logger  logger;
    
   static {
	   logger=Logger.getLogger(Example4.class);
	   PropertyConfigurator.configure("Log4j.properties");
   }
   
   
   static void m1() {
	   logger.info("in m1");
   }
   
   static void m2() {
	   logger.info("in m2, start");
	   int m=10;
	   int n=20;
	   logger.info("in m2, end");
   }
   
   static void m3() {
	   logger.info("in m3, start");
	   int m=10;
	   int n=20;
	   logger.info("in m3, end");
   }
   
   public static void main(String[] args) {
	   logger.info("main");
	   m1();
	   m2();
	   int m=50;
	   int n=60;
	   logger.info("main end");
}
}


//output main,in m1,in m2start,in m2 end,main end


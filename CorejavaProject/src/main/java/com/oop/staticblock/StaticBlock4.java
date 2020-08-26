package com.oop.staticblock;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class StaticBlock4 {
    static Logger  logger;
    static int a=10;
    static int b=20;
    
   static {
	   logger=Logger.getLogger(StaticBlock4.class);
	   PropertyConfigurator.configure("Log4j.properties");
		 logger.info("1st static block");
   }
   

	static {
		 logger.info("2nd SB");
	}
	
	
	
	public static void main(String[] args) {
     logger.info("main");
	}
	static void m1(){
		 logger.info("SM");
	}
	
}

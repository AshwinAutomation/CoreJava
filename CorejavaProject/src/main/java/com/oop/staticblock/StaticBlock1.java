package com.oop.staticblock;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class StaticBlock1 {
    static Logger  logger;
   
   static {
	   logger=Logger.getLogger(StaticBlock1.class);
	   PropertyConfigurator.configure("Log4j.properties");
		 logger.info("1st static block");
   }
   

	static {
		 logger.info("2nd static block");
	}
	
	
	
	public static void main(String[] args) {
     logger.info("main");
	}
}

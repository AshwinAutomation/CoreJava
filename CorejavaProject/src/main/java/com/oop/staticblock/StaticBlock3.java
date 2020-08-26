package com.oop.staticblock;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class StaticBlock3 {
    static Logger  logger;
   
   static {
	   logger=Logger.getLogger(StaticBlock3.class);
	   PropertyConfigurator.configure("Log4j.properties");
		 logger.info("1st static block");
   }
   

	static {
		 logger.info("3rd static block");
	}
	
	
	
	public static void main(String[] args) {
     logger.info("main");
	}
	static {
		 logger.info("2nd static block");
	}
	
}

package com.oop.staticmember;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example6 {
	static Logger logger;
	static {
		logger = Logger.getLogger(Example6.class);
		PropertyConfigurator.configure("Log4j.properties");

	}

	
     static int a=10;
     
	public static void main(String[] args) {
      int a =50;
      Example6.a=a;
      logger.info("a : " + a);
      logger.info("a : " + Example6.a);
	}
}

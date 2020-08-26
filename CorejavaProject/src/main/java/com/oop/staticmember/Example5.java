package com.oop.staticmember;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example5 {
	static Logger logger;
	static {
		logger = Logger.getLogger(Example5.class);
		PropertyConfigurator.configure("Log4j.properties");

	}

	
     static int a=10;
     
	public static void main(String[] args) {
      int a =20;
      a=a;
      logger.info("a : " + a);
      logger.info("a : " + Example5.a);
	}
}

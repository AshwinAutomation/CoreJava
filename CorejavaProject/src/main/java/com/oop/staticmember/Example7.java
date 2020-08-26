package com.oop.staticmember;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example7 {
	static Logger logger;
	static {
		logger = Logger.getLogger(Example7.class);
		PropertyConfigurator.configure("Log4j.properties");

	}

	static int a;

	static void m1(int x) {
		a = x;
		logger.info("a : " + a);//50
	}

	public static void main(String[] args) {
		logger.info("a : " + a);//0
		m1(50);
		logger.info("a : " + a);//50
		
		//output(0,50,50)
	}
}

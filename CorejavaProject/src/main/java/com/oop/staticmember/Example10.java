package com.oop.staticmember;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example10 {
	static Logger logger;
	static {
		logger = Logger.getLogger(Example10.class);
		PropertyConfigurator.configure("Log4j.properties");

	}

	static int a;

	static void m1(int a) {
		// variable shadowing
		a = Example10.a;
		logger.info("a : " + a);// 0
	}

	public static void main(String[] args) {
		logger.info("a : " + a);// 0
		m1(50);
		logger.info("a : " + a);// 0

		// output(0,50,0)
	}
}

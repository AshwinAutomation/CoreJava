package com.oop.staticmember;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example2 {
	static Logger logger;
	static {
		logger = Logger.getLogger(Example2.class);

		PropertyConfigurator.configure("Log4j.properties");
	}
	static int a = m1();

	static int m1() {
		logger.info("Variable a is created");
		return 10;
	}

	static int m2() {
		logger.info("Variable b is created");
		return 20;
	}

	public static void main(String[] args) {
		logger.info("main");
		logger.info("a : " + a);
		logger.info("b : " + b);
	}

	static int b = m2();
}

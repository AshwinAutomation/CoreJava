package com.oop.staticmember;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example11 {
	static Logger logger;
	static {
		logger = Logger.getLogger(Example11.class);
		PropertyConfigurator.configure("Log4j.properties");

	}

	static int a;

	static int b;

	static void m1() {
		a = 10;
		b = 20;
	}

	static void m2(int x, int y) {
		a = x;
		b = y;
	}

//variable shadowing so take local preference
	static void m3(int a, int b) {
		a = a;
		b = b;
	}

	static void m4(int a, int b) {
		Example11.a = a;
		Example11.b = b;
	}

	public static void main(String[] args) {
		logger.info(a + "................." + b);//0 ..... 0
		System.out.println();
		
		m1();
		logger.info(a + "................." + b);//10 ..... 20
		System.out.println();
		
		m2(30, 40);
		logger.info(a + "................." + b); //30 ..... 40
		System.out.println();
		
		m3(50,60);
		logger.info(a + "................." + b); //30 ..... 40
		System.out.println();
		
		m4(70, 80);
		logger.info(a + "................." + b); //70 ..... 80
		System.out.println();
	}
}

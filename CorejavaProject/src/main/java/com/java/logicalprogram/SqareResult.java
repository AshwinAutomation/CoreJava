package com.java.logicalprogram;

public class SqareResult {

	/*
	 *   2*2+5*5=29
	 * 
	 * */
	public int square(int a) {
		 int s=a*a;
		 
		 return s;
	}
	
	public void sum(int a ,int b) {
		int sumResult=a+b;
		System.out.println("sumResult  : " + sumResult);//29
	}
	
	public static void main(String[] args) {
		SqareResult result=new SqareResult();
		int p=result.square(2);
		int q=result.square(5);
		result.sum(p, q);
	}
}

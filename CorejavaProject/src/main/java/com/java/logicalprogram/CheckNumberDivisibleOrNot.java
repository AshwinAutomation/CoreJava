package com.java.logicalprogram;

public class CheckNumberDivisibleOrNot {

	public void divisibleNumber(int a) {
		if (a % 5 == 0 && a % 11 == 0) {
			System.out.println("number is divisiblle by 5 and 11");
		} else if (a % 5 == 0) {
			System.out.println("number is divisiblle by only 5");
		} else if (a % 11 == 0) {
			System.out.println("number is divisiblle by only 11");
		}
	}

	public static void main(String[] args) {
      CheckNumberDivisibleOrNot number=new CheckNumberDivisibleOrNot();
      number.divisibleNumber(22);
      number.divisibleNumber(30);
      number.divisibleNumber(55);
	}
}

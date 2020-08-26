package com.java.logicalprogram;

public class ReverseNumber {

	public static void main(String[] args) {


		
	int number=21345;
	int reverse=0;
	
	while(number!=0) {
	    int newNumber=number%10;
	    
	    reverse=reverse*10+newNumber;
	    number=number/10;
		
	}
	
	System.out.println(reverse);

	
	    
	vowelandConsonent('i');
	evenAndOdd(44);
	}
	
	
	static void vowelandConsonent(char ch) {
		if (ch=='a'|| ch=='e' || ch=='i'|| ch=='o'||ch=='u') {
			System.out.println(ch + " is a vowel");
		}
		
		else {
			System.out.println(ch + " is a consonent");
		}
	
	}
	
	
	static void evenAndOdd(int number) {
		if (number%2==0) {
			System.out.println(number + " is a even number");
		}
		else {
			System.out.println(number + " is a odd number");
		}
	}
	

}

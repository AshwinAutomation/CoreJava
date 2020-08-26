package com.java.logicalprogram;

public class ReverseNumberCheck {

	public static void main(String[] args) {

		int number=12345;
		
		int reverse=0;
	/*	 while(number!=0) {
			 
			 int digit=number%10;
			 reverse=reverse*10+digit;
			 number/=10;
		 }
		System.out.println(reverse);
	
*/
		//2nd approch
		
		while(number!=0) {
		
			reverse=reverse*10 + number%10;
			number=number/10;
			
		}
		System.out.println(reverse);
		
		
		
}
}
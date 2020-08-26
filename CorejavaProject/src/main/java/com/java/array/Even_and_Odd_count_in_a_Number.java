package com.java.array;

public class Even_and_Odd_count_in_a_Number {

	public static void main(String[] args) {

		int num=12345678;//odd 1357 even 2468
		
		int evencount=0;
		int oddcount=0;
		
		while(num>0) {
			
			int reminder=num%10;
			if (reminder%2==0) {
				evencount++;
			
			}
			else {
				oddcount++;
	
			}
			num=num/10;
		}
        
		
			System.out.println(evencount);
			System.out.println(oddcount);
	}

}

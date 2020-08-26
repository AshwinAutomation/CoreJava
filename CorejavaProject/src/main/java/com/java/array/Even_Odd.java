package com.java.array;

public class Even_Odd {

	public static void main(String[] args) {

		int num=20;
/*		while(num>0) {
			if (num%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
		*/
		
		for (int i = 1; i < num/2; i++) {
			if (num%i==0) {
				System.out.println("even");
			}
			System.out.println("odd");
		}
		
	}

}

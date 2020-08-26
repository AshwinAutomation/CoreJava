package com.java.array;

public class DuplicateArray {

	public static void main(String[] args) {

		int [] a= {10,20,20,21,21,22,23,24,25,25,26,27,28,28};
		
		int lengthValue=a.length;
		
		for (int i = 0; i < lengthValue; i++) {

		for (int j = i+1; j < lengthValue; j++) {
			
			if (a[i]==a[j]) {
				System.out.println(a[j]);
			}
		}
		}
		
	}

}

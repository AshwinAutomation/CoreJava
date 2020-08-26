package com.java.array;

public class Array_DuplicateElement {

	public static void main(String[] args) {

		
		int a[]= {1,2,2,3,4,5,5,6,7,7};
		
		int len=a.length;
		
		for (int i = 0; i < len; i++) {
		
			System.out.println(a[i]);
			for (int j = i+1; j < len; j++) {
				if (a[i]==a[j]) {
				}
				System.out.println("print duplicate :" + a[j]);
			}
		}
		
		
		
	}

}

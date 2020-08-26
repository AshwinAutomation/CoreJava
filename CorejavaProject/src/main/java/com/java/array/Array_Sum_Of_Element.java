package com.java.array;

public class Array_Sum_Of_Element {

	public static void main(String[] args) {

		int [] a= {3,4,5,7,9,8};//36
		
		int len=a.length;
		System.out.println(len);
		
		int sum=0;
		
		for (int i = 0; i <len; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}

}

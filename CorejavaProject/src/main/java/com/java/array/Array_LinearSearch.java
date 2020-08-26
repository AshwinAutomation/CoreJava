package com.java.array;

public class Array_LinearSearch {

	public static void main(String[] args) {


		int a[]= {30,40,50,60,70,80};
		int len=a.length;
		int search_element=70;
		
		for (int i = 0; i < len; i++) {
			System.out.println(a[i]);
			
			if (search_element==a[i]) {
				System.out.println("element present at index :" + i);
				break;
			}
			
		}
		
		
	}

}

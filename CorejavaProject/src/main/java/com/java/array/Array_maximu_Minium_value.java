package com.java.array;

public class Array_maximu_Minium_value {

	public static void main(String[] args) {

		int a[]= {30,40,50,60,70,80};
		int len=a.length;
		
		int max=a[0];
		for (int i = 0; i < len; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println(max);
	}

}

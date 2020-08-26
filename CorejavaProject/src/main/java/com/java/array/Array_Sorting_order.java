package com.java.array;

import java.util.Arrays;

public class Array_Sorting_order {

	public static void main(String[] args) {

		int[] a= {2,4,6,8,10,1,3,5,7,9};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}

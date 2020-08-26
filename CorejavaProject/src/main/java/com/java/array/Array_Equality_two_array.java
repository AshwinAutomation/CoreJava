package com.java.array;

import java.util.Arrays;

public class Array_Equality_two_array {

	public static void main(String[] args) {

		
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		boolean test=Arrays.equals(a1, a2);
		
		if (test==true) {
			System.out.println("equals");
		}
		else {
			System.out.println("not_equals");
		}
	}

}

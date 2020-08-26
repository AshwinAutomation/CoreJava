package com.java.array;

public class String_Number_of_occurances {

	public static void main(String[] args) {

		String s1="ashwin Mahakul";
		
		int l1=s1.length();
		System.out.println(l1);
		int l2=s1.replace("a", "").length();
		System.out.println(l1-l2);
	}

}

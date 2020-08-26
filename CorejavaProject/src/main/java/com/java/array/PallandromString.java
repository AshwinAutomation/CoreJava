package com.java.array;

public class PallandromString {

	public static void main(String[] args) {

		String s1="madam";
		String s2="";
		String temp=s1;
		int lenth=s1.length();
		for (int i = lenth-1; i >=0 ; i--) {
			s2=s2+s1.charAt(i);
			
		}
		System.out.println(s2);
		
		if (temp.equalsIgnoreCase(s2)) {
			System.out.println(s2 + " is a pallandrom");
		}
		else {
			System.out.println(s2 + " is not  a pallandrom");

		}
	}

}

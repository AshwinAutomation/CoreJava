package com.java.array;

public class ReverseString {

	public static void main(String[] args) {

		String s1="Abcde";
		String s2="";
		int len=s1.length();
		
		/*for (int i = len-1; i >=0; i--) {
			s2=s2+s1.charAt(i);
			
		}
		System.out.println(s2);*/
		
		char[] a=s1.toCharArray();
		
		for(int i=len-1;i>=0;i--) {
			s2=s2+a[i];
		}
		System.out.println(s2);
	}

}

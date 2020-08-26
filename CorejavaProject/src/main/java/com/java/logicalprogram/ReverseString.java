package com.java.logicalprogram;


public class ReverseString {

	public static void main(String[] args) {

		String name="Ashwin";
		String reverse="";
		
/*		int nameLength=name.length();
		
		for (int i=nameLength-1; i >= 0; i--) {
			
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);*/
		
		
		//2nd Approch
		
		//string Buffer
	/*	StringBuffer sb=new StringBuffer(name);
		System.out.println(sb);
		System.out.println(sb.reverse());
		*/
		
		
		//3rd approch
		
		char[] a=name.toCharArray();
		System.out.println(a);
		int len=a.length;
		for(int i=len-1;i>=0;i--) {
			reverse=reverse+a[i];
		}
		System.out.println("Reverse Number : " + reverse);
		
		
	}

	
	  
	
	
	
	
	     
	
	
	
	
}

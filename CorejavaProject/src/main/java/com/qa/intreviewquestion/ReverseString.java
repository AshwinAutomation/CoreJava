package com.qa.intreviewquestion;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Ashwin";
		String rev = "";

		int lengthofString = str.length();// 6
		/*for (int i = lengthofString - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("reverse string is :" + rev);	*/
	
	
	//Approach ::2(toCharArray())
	
	   char[] a=str.toCharArray();
	    for(int i=lengthofString-1;i>=0;i--) {
	    	rev=rev+a[i];
	    }
	    System.out.println("reverse string is :" + rev);	
	}

}

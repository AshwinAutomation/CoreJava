package com.qa.intreviewquestion;

public class DuplicateFromArray {

	public static void main(String[] args) {

		int [] a= {11,22,33,44,55,66,77,77,88,88,99,99};
		
		int len=a.length;
		for (int i = 0; i <len; i++) {
		for (int j = i+1; j <len; j++) {
			if (a[i]==a[j]) {
				
				System.out.println("print duplicate :" + a[j]);
			}
		}
		}
		
		
	}

}

package com.java.array;

public class Array_Missing_Number_in_Array {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,7};
		
		int len=a.length;
		
		int sum1=0; int sum2=0; 
		for (int i = 0; i < len; i++) {
			
			sum1=sum1+a[i];
			
		}
		System.out.println(sum1);
		
		for (int i = 0; i <=7; i++) {
			sum2=sum2+i;
			
		}
		System.out.println(sum2);
		int missingNum=sum2-sum1;
		System.out.println("missing number is : " + missingNum);
		
	}

}

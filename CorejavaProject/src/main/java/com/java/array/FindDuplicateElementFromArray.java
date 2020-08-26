package com.java.array;

public class FindDuplicateElementFromArray {

	public static void main(String[] args) {

//how to get duplicate from arrary
		
		
		 int[] number = {11,22,33,44,55,66,44,33};
		
		 int lengthOfElements=number.length;
		 
		 System.out.println("lengthOfElements : " + lengthOfElements);
		 for (int i = 0; i < lengthOfElements; i++) {
			//System.out.println("Print all elements:" + number[i]);
			
			for (int j = i+1; j <lengthOfElements; j++) {
				
				
				if (number[j]==number[i]) {
					
					System.out.println("Print duplicate elements : " + number[j]);
					
				}
			}
			 
		}
		 
	}

}

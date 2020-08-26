package com.java.array;

public class FindDuplicateElementFromArrayUsingString {

	public static void main(String[] args) {

		String[] nameList= {"Rangadhar","Amar","Anita","Aswani","Apurb","Aswani"};
		
		int nameListLength=nameList.length;
		System.out.println("nameListLength : " + nameListLength);
		for (int i = 0; i < nameListLength; i++) {
			//System.out.println("Print all name : " + nameList[i]);
			
			//inner for loop
			
			for (int j = i+1; j < nameList.length; j++) {
				
				if (nameList[i]==nameList[j]) {
					System.out.println("Print duplicate : " + nameList[j]);
				}
				
			}
			
		}
		
		
		
	}

}

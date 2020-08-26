package com.java.array;

public class FindDuplicatesFromArrayUsingObject {

	public static void main(String[] args) {

    Object[] contentList= {11,22,33,44,44,11,"Ashwin","Sampad","Deepak","Anjan","Deepak","Sampad"};
    //duplicate list: 11,44,sampad,deepak
	
    
    int lengthofContentList=contentList.length;
    
    for (int i = 0; i <lengthofContentList; i++) {
		
    	//System.out.println(contentList[i]);
    	
    	for (int j = i+1; j < lengthofContentList; j++) {
			if (contentList[i]==contentList[j]) {
				System.out.println("print duplicate elements only :" + contentList[j] );
			}
		}
    	
	}
    
	
	}

}

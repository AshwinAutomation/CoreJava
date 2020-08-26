package com.java.collection.arrayllist;

import java.util.ArrayList;
import java.util.Collections;

public class Add_Elements_of_an_arraylist_to_another_arraylist {

	public static void main(String[] args) {

		ArrayList<Object> firstList = new ArrayList<Object>();

		firstList.add(0, "Anuraag");
		firstList.add(1, "CyberSecurity");
		firstList.add(2, "New Delhi");
		firstList.add(3, "SailPoint");
		firstList.add("M");
		System.out.println("Anuraag Details : " + firstList);

		ArrayList<Object> secondList = new ArrayList<Object>();

		secondList.add(90000);
		System.out.println("Anuraag Details : " + secondList);

		secondList.addAll(firstList);
		System.out.println("Anuraag Details : " + secondList);
		
		
		Object[] allDetails=secondList.toArray();
       for(Object alldata:allDetails) 
       
       {
    	   System.out.println(alldata);
    	   
       }	
		       
		

	}

}

package com.collection.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Alphabet {
	public static void main(String[] args) {

		List<String> alphabetorder = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		System.out.println(alphabetorder);
		alphabetorder.add(6, "G");
		System.out.println(alphabetorder);

		// removing elements

		alphabetorder.remove("A");
		System.out.println(alphabetorder);
		alphabetorder.remove(5);
		System.out.println(alphabetorder);

		// finding the elements

		boolean status = alphabetorder.contains("D");
       
		if (status) {
			  System.out.println("alphabetorder list contains :  D ");
		} else {
			  System.out.println("alphabetorder list not contains :  D ");
		}
		
		//print all elements using cursor
		
		
		     Iterator<String>alphabetList=alphabetorder.iterator();
		
		     while(alphabetList.hasNext()) {
		    	 
		     System.out.println("print all elements using cursor : " + alphabetList.next());
		     }
		     
		     
		     
		     //sorting order
		     
		     Collections.sort(alphabetorder);
		     System.out.println(alphabetorder);
		     
		     
	}
	
	

	
	
}

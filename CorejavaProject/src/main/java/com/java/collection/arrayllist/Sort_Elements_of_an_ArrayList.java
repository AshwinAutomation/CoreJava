package com.java.collection.arrayllist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort_Elements_of_an_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> alist=new ArrayList<>(Arrays.asList("Ashwin","Security Analyst","IN010M67931","10","11","19"));
		//insertion order must be preserved
		//System.out.println(alist);
		
		
		//convert to an array
/*		
		Object[] convertToArray=alist.toArray();
		
		
		
		for (Object objectData : convertToArray) {
			System.out.println(objectData);
		
		}*/
		
		//set object
		
		
		//alist.set(1, "SDET");
		//System.out.println("after value set : " + alist);
		
		
		
		//sorting order or random order
	   Collections.sort(alist);
		System.out.println(alist);
	}
	

	
	

}

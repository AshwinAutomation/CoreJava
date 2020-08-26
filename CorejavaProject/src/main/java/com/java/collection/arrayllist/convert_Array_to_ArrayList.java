package com.java.collection.arrayllist;

import java.util.ArrayList;
import java.util.Arrays;

public class convert_Array_to_ArrayList {

	public static void main(String[] args) {

		String [] value= {" Ashwin","Ernst and Young"};

		
		for (String data : value) {
			System.out.println("data :" + data);
		}
		ArrayList<String> alist=new ArrayList<>(Arrays.asList(value));
		
		System.out.println(alist);
		
		
		
		System.out.println(alist.indexOf(0));
		System.out.println(alist.lastIndexOf(alist));
		System.out.println(alist.size());
		
		
		alist.removeAll(alist);
		System.out.println(alist);
	
		
		
	}
	
	
	
	
	

}

package com.java.collection.arrayllist;

import java.util.ArrayList;

public class ExampleArrayList {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("AA");
		alist.add("BB");
		alist.add("CC");
		alist.add("DD");
   
		
		System.out.println(alist);
		
		
		alist.add(4,"ZZ");
		
		System.out.println(alist);
		
		
		
		ArrayList<Object> allData=new ArrayList<>();
		allData.add("null");
		
		allData.addAll(alist);
		
		System.out.println(allData);
		
	}
	

}

package com.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> linklist=new LinkedList<>();
		linklist.add("Ashwin");
		linklist.add("Ernst and Young");
		linklist.add("Security Analyst");
		linklist.add("Bangalore");
		
		
	
		System.out.println("Print All data :"  + linklist );
		
		
		 Iterator<String> data=linklist.iterator();
		 while (data.hasNext()) {
			System.out.println(data.next());
		}
		
		//System.out.println("initial value : " + linklist.get(0));
		
/*		for (Object object : linklist) {
			System.out.println(object);
		}
		System.out.println("======********========");
		//convert in to array
		
		System.out.println("convert in to array");
		Object[] elementsConvertToArray=linklist.toArray();
		
		
		for (Object object : elementsConvertToArray) {
			System.out.println(object);
		}
		System.out.println("======********========");
		
		System.out.println("With iterator and while loop");
		
		// using iterator()
		 Iterator<Object> data=linklist.iterator();
		 while (data.hasNext()) {
			System.out.println(data.next());
		}*/
		
	}}
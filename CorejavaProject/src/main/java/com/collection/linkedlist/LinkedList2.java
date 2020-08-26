package com.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {
	public static void main(String[] args) {
		
		LinkedList<String> hunterAnimalList=new LinkedList<>();
		 
		hunterAnimalList.add("Tiger");
		hunterAnimalList.add("Elephant");
		hunterAnimalList.add(2, "jackel");
		
		System.out.println("hunterAnimalList : " + hunterAnimalList);
		
		
		hunterAnimalList.set(0,"zebra");
		System.out.println("hunterAnimalList : " + hunterAnimalList);
		
		//convert to array 
		
		Object[] allData=hunterAnimalList.toArray();
		
		for (Object object : allData) {
			System.out.println(object);
		}
		
		System.out.println("++++++using iterator++++++");

		//using iterator
		 Iterator<String> allValues=hunterAnimalList.iterator();
		
		while(allValues.hasNext()) {
			
			System.out.println(allValues.next());
			
		}
		
		
		
		LinkedList<String> domesticAnimalList=new LinkedList<>();
		
		domesticAnimalList.addAll(domesticAnimalList);
		System.out.println("before adding animal : " + domesticAnimalList);
		
		domesticAnimalList.add("cow");
		domesticAnimalList.add("calf");
		domesticAnimalList.add("buffallo");
		
		System.out.println("after adding animal : " + domesticAnimalList);
		   
		
		LinkedList<String> animalList=new LinkedList<>();
		
		animalList.addAll(hunterAnimalList);
		animalList.addAll(domesticAnimalList);
		
		System.out.println(animalList);
		
		
		
		
		
		animalList.set(2, "Lion");
		
		System.out.println(animalList);
		
		System.out.println("before :" +animalList.size());	
		
		animalList.addFirst("Ox");
		animalList.addLast("Bull");
		System.out.println(animalList);
		System.out.println("after :" +animalList.size());	
		
		
		
		System.out.println("get firstelement : " + animalList.getFirst());
		
		System.out.println("get lastelement : " + animalList.getLast());
		
		
		animalList.retainAll(animalList);
		System.out.println(animalList);
		
		animalList.retainAll(hunterAnimalList);
		System.out.println(animalList);
	}

	
	
	
	
	
	  
	
	
}

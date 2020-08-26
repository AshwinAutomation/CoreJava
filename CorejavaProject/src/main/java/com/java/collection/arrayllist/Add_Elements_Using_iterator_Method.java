package com.java.collection.arrayllist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Add_Elements_Using_iterator_Method {

	public static void main(String[] args) {

		ArrayList<Object> animalList = new ArrayList<>(Arrays.asList("tiger", "lion", "elephant"));

		System.out.println("animalList : " + animalList);

		Iterator<Object> allValue = animalList.iterator();

		while (allValue.hasNext()) {
			System.out.println(allValue.next());
		}

		
		ArrayList<Object> animalList2 = new ArrayList<>(Arrays.asList("beer"));
		
		animalList2.addAll(animalList);
		System.out.println(animalList2);
		
      Object[] allAnimals=	animalList2.toArray();
      for (Object value : allAnimals) {
		
    	  System.out.println(value);
	}
      
		System.out.println(animalList2.get(2));
		
		
		animalList2.remove(2);
		System.out.println(animalList2);
		
		animalList2.removeAll(animalList);
		
		System.out.println(animalList2);
		
		Object[] objValue=animalList2.toArray();
		
		
		for (Object object : objValue) {
			System.out.println(object);
		}
		
		
		animalList2.removeAll(animalList2);
		System.out.println(animalList2);
	}


	
}

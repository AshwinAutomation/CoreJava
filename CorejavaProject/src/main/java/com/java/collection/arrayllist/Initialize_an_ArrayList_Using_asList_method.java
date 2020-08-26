package com.java.collection.arrayllist;

import java.util.ArrayList;
import java.util.Arrays;

public class Initialize_an_ArrayList_Using_asList_method {
	public static void main(String[] args) {
        ArrayList<Object> animalsList=new ArrayList<>(Arrays.asList("Cat","Rat","Cow"));
        
        System.out.println("animal List : " + animalsList);
        
        Object animalName=animalsList.get(2);
        
        System.out.println("animalName : " + animalName);
        
        for(Object value:animalsList.toArray()) {
        	System.out.print(" " + value);
        }
        

	}
}

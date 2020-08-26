package com.java.collection.arrayllist;

import java.util.ArrayList;
import java.util.Arrays;

public class Change_an_element_in_ArrayList {
public static void main(String[] args) {
	ArrayList<Object> elements=new ArrayList<>(Arrays.asList("ABC","DEF",null,10,true,50f,"ABC"));
	System.out.println(elements);
	
	//set new value from exising value
	
	
	elements.set(0, "PQR");
	System.out.println(elements);
	
	//clear all elements
	
	
	
	if (elements.contains("ABC")) {
	System.out.println("inside if");
	elements.clear();
	System.out.println(elements);
	
	}
	
	else {
		System.out.println("inside else");
	}
}
}

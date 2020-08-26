package com.java.collection.arrayllist;

import java.util.ArrayList;

public class Add_Elements_to_an_ArrayList {

	public static void main(String[] args) {
		//default constructor
		//initial capacity 10 if exceed more then 10 then a new arraylist will be created with size[new capacity=(currentCapacity*3/2)+1] and object reference will newly created arraylist
		ArrayList animalsList=new ArrayList();
		animalsList.add("cow");
		animalsList.add("dog");
		animalsList.add("cat");
		animalsList.add("horse");
		System.out.println("animalsList :" + animalsList);
	}

}

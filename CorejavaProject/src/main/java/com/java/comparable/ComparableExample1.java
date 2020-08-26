package com.java.comparable;

import java.util.TreeSet;

public class ComparableExample1 {
	public static void main(String[] args) {

		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("K"));
		System.out.println("A".compareTo("A"));
		//System.out.println("A".compareTo(null));
		
		
		TreeSet<String> t1=new TreeSet<>();
		t1.add("K");
		t1.add("Z");
		t1.add("A");
		t1.add("A");
		System.out.println(t1);
	}
}

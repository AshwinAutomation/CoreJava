package com.java.comparator;

import java.util.TreeSet;

public class ComparatorExample1 {

	public static void main(String[] args) {

		TreeSet<Integer> s1= new TreeSet<Integer>(new MyComparator());
		s1.add(10);
		s1.add(0);
		s1.add(15);
		s1.add(5);
		s1.add(20);
		s1.add(20);
		System.out.println(s1);	
		
	}
}

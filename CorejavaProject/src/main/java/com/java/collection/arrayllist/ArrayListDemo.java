package com.java.collection.arrayllist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1.If you represent a group of individual object as single entity where
 * duplicates are allowed and insertion order must be preserved then we should
 * go for List(I); 2.Implementation classes are: ArrayList(c),LinkedList(c),
 * 3.Vector(c) and Stack(c) is and legacy classes. note:
 * 
 * ===> duplicate allowed ===> insertion order must be preserved ===>
 * Heterogeneous objects are allowed ===> null insertion are allowed
 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add("Ashwin");
		l.add("Mahakul");
		l.add("security Analyst");
		l.add(550000);
		l.add(null);
		l.add("Ashwin");



		Collections.sort(l);
		System.out.println(l);

		/*
		 * List l2=new ArrayList(); l2.add("EY"); l2.addAll(l);
		 * System.out.println(l2.toString());
		 * 
		 * if (l2.isEmpty()==false) { System.out.println(l2.size()); l.remove(4);
		 * System.out.println(l.toString());
		 * 
		 * Object c=l2.get(3); System.out.println(c); }
		 */
	}

}

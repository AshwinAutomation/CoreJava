package com.java.list;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample1 {

	public static void main(String[] args) {

		Collection<String> c1=new LinkedList<>();
		c1.add("Ashwin");
		c1.add("Mahakul");
		c1.add("QA");
		c1.add("Ernst and Young");
		System.out.println(c1);
		
        LinkedList<String> l2=new LinkedList<>();
        l2.addAll(c1);
        l2.add("45000");
        System.out.println(l2);
		ListIterator<String> list2=l2.listIterator();
		while (list2.hasNext()) {
			String s2=list2.next();
			

		
			
		}
		list2.set("IT");
		
		System.out.println(l2);
	}

}

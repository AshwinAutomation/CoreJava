package com.java.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample1 {

	public static void main(String[] args) {

		Collection<Object> c1=new ArrayList<>();
		
	      c1.add("Ashwin");
	      c1.add("mahakul");
	      c1.add("QA");
	      c1.add("ashwin");
	     // System.out.println(c1);
		
	      List<Object>obj1=(ArrayList)c1;
	      obj1.add("EY");
	     System.out.println(obj1);
	      
/*
	      for (int i = 0; i < obj1.size(); i++) {
			
	    	  Object obj=obj1.get(i);
	    	//  System.out.println(obj);
	    	 obj1.set(2, "Security Analyst");
	    	 System.out.println(obj);
		}*/
	      
	   /*  Iterator<Object> listvalue=obj1.iterator();
	     while (listvalue.hasNext()) {
			Object aa=listvalue.next();
			System.out.println(aa);
		}*/
	      
	}

}

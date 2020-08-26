package com.collection.crusor.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class GetEvenNumbers {

	
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		
		for(int i=0; i<=100;i++)
		{
			v.add(i);
		}
        	
			
			System.out.println("count all element :" + v);
			 
		       Enumeration<Integer> e= v.elements();		
	
		
       while(e.hasMoreElements()) {
    	   
             Integer value=e.nextElement();    	 
             
             
             if (value%2==0) {
				System.out.println("print even numner : " + value);     
             
   	}
   
             
       }
		
	}
}

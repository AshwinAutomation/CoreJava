package collection.vector;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Animals {

	public static void main(String[] args) {
		Vector<String> animalsName=new Vector<>(Arrays.asList("Dog","Bull","Cat","Goat"));
		
		System.out.println("animalsName are : " + animalsName);
		
		
		//iterator
		    Iterator<String> allAnimals=animalsName.iterator();
		    while(allAnimals.hasNext())
		    {
		    	System.out.println(allAnimals.next());
		    	
		    }
		    
		    
		    //get element
		     
		   System.out.println("animal Name : " +animalsName.elementAt(3));
		   
		   
		   //count using foreach loop
		   
		   for(String animals:animalsName) {
			   System.out.println(animals);
		   }
		   
		   
		   //Remove element
		   String animals=animalsName.remove(2);
		   System.out.println("animals name : " + animals);
		    
		   
		Enumeration<String> data=   animalsName.elements();
		 
		while(data.hasMoreElements())
		{
			System.out.println("get object 1 by 1 using crushor : " + data.nextElement());
		}
		
		
		//ireator
		
		
		     
		
		
	}
	
	
	
	
	
	
}

package com.java.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashsetExample1 {

	public static void main(String[] args) {

		//duplicates are not allowed and insertion order not preserved
		Set<Object> s1=new HashSet<>();
		s1.add('A');
		s1.add('B');
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(1);//duplicate
		System.out.println(s1);
		System.out.println(s1.toString());
		Iterator<Object>l1=s1.iterator();
		while (l1.hasNext()) {
			System.out.println(l1.next());
		}
		
		
		
		
		
		
		
		
		//duplicates are not allowed but insertion order preserved
		Set<Object> s2=new LinkedHashSet<>(Arrays.asList(1,1,2,2,3,'a','b',"c",'c'));
		System.out.println(s2);
		
		for(int i=0;i<s2.size();i++) {
			
			
		}
		System.out.println(s2);
		
	}

	
	
	
	
	
	
	
	
	
	
	
}

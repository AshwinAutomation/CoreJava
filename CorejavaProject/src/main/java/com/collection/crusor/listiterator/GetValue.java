package com.collection.crusor.listiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class GetValue {

	public static void main(String[] args) {

		List<String> files=new LinkedList<>();
		files.add("Manual Testing");
		files.add("Automation Testing");
		files.add("Performance Testing");
		files.add("Database Testing");
		files.add("API testing");
   
		
		System.out.println("files : " + files);
		
		
		ListIterator<String> allData=files.listIterator();
		
		while(allData.hasNext()) {
			
			Object obj=allData.next();
			System.out.println("obj : " + obj);
			if (obj.equals("Manual Testing")) {

			allData.remove();
			System.out.println("files after remove: " + files);
			}
			
			else if (obj.equals("Performance Testing")) {
				allData.set("end to end testing");
				System.out.println("files after set: " + files);
			}  
		}
		
		
		
		
	}

}

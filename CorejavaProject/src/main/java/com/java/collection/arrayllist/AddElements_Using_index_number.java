package com.java.collection.arrayllist;

import java.util.ArrayList;


public class AddElements_Using_index_number {

	public static void main(String[] args) {

		ArrayList<Object> employeeDetail=new ArrayList<>();
		employeeDetail.add(0,"Shasank Shankar");
		employeeDetail.add(1,"Ernst and Young");
		employeeDetail.add(2, "Devloper");
		employeeDetail.add(3,30000);
		employeeDetail.add(4,null);
		
		
		System.out.println("employeeDetail: " + employeeDetail);
		
		System.out.println("employeeDetail size :" + employeeDetail.size());
		
		  Object[] employeeDetailValue=employeeDetail.toArray();
		  
		  for(Object obj:employeeDetailValue) {
		 System.out.println("employeeDetailValue : " + obj);
		 
		  }
		  
		  if (employeeDetail.isEmpty()==false) {
			System.out.println("size of index :" + employeeDetail.size());
		}
		 
	}

}

package com.java.array;

public class String_RemoveJunk_or_SpecialCharecter {

	public static void main(String[] args) {
     
		String name="@#%&&^^&%%%%^$*********Ashwin****123";
		
		name=name.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(name);
	}

}

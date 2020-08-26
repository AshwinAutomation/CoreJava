package com.java.array;

public class String_Remove_WhiteSpaces {

	public static void main(String[] args) {

		String s1= "Ashwin mahakul Software engineer ernst and young";
		s1=s1.replaceAll("\\s", "");
		System.out.println(s1);
	}

}

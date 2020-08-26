package com.java.array;

import java.util.Iterator;

class String_Reverse_Each_word_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "welcome to java";
		String[] word = s1.split(" ");
		String revstring = "";
		for (String w : word) {
			String revword = "";

			for (int i = w.length()- 1; i >= 0; i--) {
				revword = revword + w.charAt(i);
		
			}
			revstring = revstring + revword + " ";
		}
		System.out.println(revstring);
	}

}

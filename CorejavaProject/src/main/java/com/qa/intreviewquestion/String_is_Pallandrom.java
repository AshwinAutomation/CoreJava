package com.qa.intreviewquestion;

public class String_is_Pallandrom {

	public static void main(String[] args) {

		String str = "Madam";
		String rev = "";
  
		String new_str=str;
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);
		System.out.println(new_str);
		if (new_str.equalsIgnoreCase(rev)) {
			System.out.println(rev + " is a pallandrom");
		} else {
			System.out.println(rev + " is not a pallandrom");
		}

	}

}

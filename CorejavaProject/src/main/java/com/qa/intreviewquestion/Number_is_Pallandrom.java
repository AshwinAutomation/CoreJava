package com.qa.intreviewquestion;

public class Number_is_Pallandrom {

	public static void main(String[] args) {

		int num = 121;

		  int new_num=num;
		  System.out.println("new_num is " + new_num);
		
		int rev = 0;

		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse numer is :" + rev);
		
		if (new_num==rev) {
			System.out.println(rev + " is a Pallandrom ");
		}
		else {
			System.out.println(rev + " is not a Pallandrom ");
		}
	}

}


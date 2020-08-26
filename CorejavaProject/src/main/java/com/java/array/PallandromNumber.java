package com.java.array;

public class PallandromNumber {

	public static void main(String[] args) {

		int num=121;
		int rev=0;
		int temp=num;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if (temp==rev) {
			System.out.println(rev+" is a pallandrom");
		}
		else
		{
			System.out.println(rev+" is a not pallandrom");
		}
	}

}

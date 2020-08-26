package com.java.logicalprogram;

   /*find largestNumber : 100,101,102
  */
public class FindLargetsNumber {

	public void checkLargeValue(int a,int b,int c) {
		
		if (a>b && a>c) {
			System.out.println(" print a largeNumber : " + a);
		}
		
		else if (b>a && b>c) {
			System.out.println(" print b largeNumber : " + b);
		}
		
		else if (c>a && c>b) {
			
			System.out.println(" print c largeNumber : " + c);
		}
	}
	
	
	public static void main(String[] args) {
		FindLargetsNumber large=new FindLargetsNumber();
		  large.checkLargeValue(100, 101, 102);
				
	}
	
}

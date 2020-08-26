package com.qa.intreviewquestion;

public class SwappingNumbres {
	public static void main(String[] args) {

		int a=10; int b=20; int c=0;
/*		
		System.out.println("before swapping a :" + a);
	
		System.out.println("before swapping b :" + b);
		
		 c= a+b;
		 a=c-a;
		 b=c-b;
		 
			
			System.out.println("after swapping a :" + a);
		
			System.out.println("after swapping b :" + b);
			*/
			
			
			System.out.println(" ********************  ");
		
			//2nd process without using 3rd variable
			
			System.out.println("before swapping a :" + a);
			
			System.out.println("before swapping b :" + b);
			a=a+b;
			
			b=a-b;
			
			a=a-b;
			
			System.out.println("after swapping a :" + a);
			
			System.out.println("after swapping b :" + b);
	}

	
	
	
	
}

package com.qa.intreviewquestion;

public class ReverseANumber {

	public static void main(String[] args) {

         int number=1234;
         int reverse=0;
         
         while (number!=0) {
			reverse=reverse*10+number%10; //0+4=4(1st iteration),0+3=3(2nd iteration),0+2=2(3rd iteration),0+1=1(4th iteration)
			number=number/10;// 1st iteration 1234/10=123,2nd iteration 123/10=12; 3rd iteration 12/10=1,4th iteration 1/10=1,
		}
		System.out.println("reverse number is :" + reverse);//1st iteration 4 ,2nd iteration 3 ,3rd iteration 2 ,4th iteration 1
	}

}

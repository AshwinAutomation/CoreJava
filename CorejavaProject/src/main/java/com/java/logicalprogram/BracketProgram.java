package com.java.logicalprogram;

public class BracketProgram {
	
	/*
	 * solve (2+8)*(2+5+7)=10*14=140
	 * 
	 * */
	
	
	
	    int addTwoNumbers(int a,int b) {
	    	int addTwo=a+b;
	    	return addTwo;
	    }
	      
	    
	    int addThreeNumber(int a , int b, int c) {
	    	
	    	int addThree=a+b+c;
	    	return addThree;
	    	
	    	
	    	
	    }
	
	    void multiplyNumbers(int p,int q)
	    {
	    	int resultforMultiplyNumber=p*q;
	    	System.out.println("resultforMultiplyNumber :" + resultforMultiplyNumber);
	    }
	    
	    
	public static void main(String[] args) {
		BracketProgram bracket=new BracketProgram();
		int s=bracket.addTwoNumbers(2, 8);
		int t=bracket.addThreeNumber(2, 5,7);
		bracket.multiplyNumbers(s, t);
	}
}

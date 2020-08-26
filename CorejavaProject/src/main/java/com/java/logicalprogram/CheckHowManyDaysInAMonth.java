package com.java.logicalprogram;

public class CheckHowManyDaysInAMonth {
	
	void dayInMonthCalculation(int month) {
		
		if (month<=0 || month>12) {
			System.out.println("invalid month");
		}
		
		else if (month==4 || month==6 || month==9 || month==11) {
			
			System.out.println("these month contains 30 days " );
		}
		
	    else if (month==2) {
	    	System.out.println("these month contains 28 days");
		}	
		
		else {
			System.out.println("these month contains 31 days");
		}
	
	}

	public static void main(String[] args) {
      
		
		CheckHowManyDaysInAMonth days=new CheckHowManyDaysInAMonth();
		days.dayInMonthCalculation(2);
		days.dayInMonthCalculation(3);
		days.dayInMonthCalculation(7);
		days.dayInMonthCalculation(8);
		days.dayInMonthCalculation(9);
		days.dayInMonthCalculation(12);
	}
}

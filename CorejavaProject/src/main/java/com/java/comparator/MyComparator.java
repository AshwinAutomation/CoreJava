package com.java.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator{

	
	public int compare(Object o1, Object o2) {
	Integer val1=(Integer)o1;
	Integer val2=(Integer)o2;
	
	if (val1<val2) {
		return +1;
	}
	
	else if (val1>val2) {
		return -1;
	}
	else {
		return 0;
	}
		
	}

}

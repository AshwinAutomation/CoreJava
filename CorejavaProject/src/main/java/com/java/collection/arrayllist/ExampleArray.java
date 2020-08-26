package com.java.collection.arrayllist;

public class ExampleArray {
public static void main(String[] args) {
	int [] aa=new int[5];
	aa[0]=10;
	aa[1]=20;
	aa[2]=30;
	aa[3]=40;
	aa[4]=50;
	
	for (int indexValue : aa) {
		System.out.println("indexValue : " + indexValue);
	}
	
}
}

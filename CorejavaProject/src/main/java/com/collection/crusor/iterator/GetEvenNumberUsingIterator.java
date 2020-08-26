package com.collection.crusor.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GetEvenNumberUsingIterator {

	public static void main(String[] args) {

		List<Object> data = new ArrayList<Object>(
				Arrays.asList("India", "japan", "Brazil", "Denmark", "Norway", 101, 102, 103, 104, 105));

		System.out.println(data);
		/*
		 * for (Object allData : data) {
		 * 
		 * System.out.println(allData); }
		 */
		Iterator<Object> values = data.iterator();

		while (values.hasNext()) {

			Object datas = values.next();
			System.out.println(datas);
			
			
			
			
			if (datas.equals(102)) {
			  values.remove();
			  System.out.println();
			}

		}

	}

}

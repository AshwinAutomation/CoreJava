package collection.vector.stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Animals {

	public static void main(String[] args) {
		// Vector<String> =new Vector<>(Arrays.asList("Dog","Bull","Cat","Goat"));

		Stack<Object> animalsName = new Stack<>();
		animalsName.push("Dog");
		animalsName.push("Bull");
		animalsName.push("Cat");
		animalsName.push("Goat");
		System.out.println("animalsName are : " + animalsName);

		Object animal = animalsName.search("Dog");

		System.out.println("animal with offset:  " + animal);

		System.out.println("animal for peak : " + animalsName.peek());

		// iteator

		Iterator<Object> alldata = animalsName.iterator();

		while (alldata.hasNext()) {
			System.out.println(alldata.next());
		}

	}
}

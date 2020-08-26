package collection.vector;

import java.util.Vector;

public class VectorWithIncrementalCapacity {

	public static void main(String[] args) {
		Vector<Object> arguments = new Vector<>(10, 5);

		for (int i = 1; i <= 10; i++) {
			arguments.addElement(i);
		}
		System.out.println(arguments);
		System.out.println(arguments.capacity());
		
		arguments.add("c");
		System.out.println(arguments.capacity());
		System.out.println(arguments);
		
	}
	
}

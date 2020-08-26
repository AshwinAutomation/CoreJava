package collection.vector.stack;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Object> value=new Vector<>();
		System.out.println(value.capacity());
		
		for (int i = 1; i <=10; i++) {
			
			value.addElement(i);
			System.out.println(i);
		}
		
		value.addElement("a");
		
		System.out.println(value);
		
		System.out.println(value.capacity());
	}
	
	
	
	
}

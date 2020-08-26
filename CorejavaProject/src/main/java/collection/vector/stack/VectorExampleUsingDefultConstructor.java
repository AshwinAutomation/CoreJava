package collection.vector.stack;

import java.util.Vector;

public class VectorExampleUsingDefultConstructor {
   
	public static void main(String[] args) {
		Vector<String> adddata=new Vector<>();
		adddata.addElement("A");
		adddata.addElement("B");
		adddata.addElement("C");
		adddata.addElement("D");
		adddata.addElement("E");
		adddata.addElement("F");
		adddata.addElement("G");
		adddata.addElement("H");
		adddata.addElement("I");
		adddata.addElement("J");
		
		System.out.println("capacity :" + adddata.capacity());
		System.out.println(adddata);
		
		
		//adddata.removeAllElements();System.out.println(adddata);
		String s= adddata.elementAt(3);
		System.out.println(s);
		
	}
}

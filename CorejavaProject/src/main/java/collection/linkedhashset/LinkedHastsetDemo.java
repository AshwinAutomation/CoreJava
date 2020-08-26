package collection.linkedhashset;

import java.util.LinkedHashSet;
// duplicate not allowed but insertion order preserved
public class LinkedHastsetDemo {
public static void main(String[] args) {
	LinkedHashSet ls=new LinkedHashSet();
	ls.add(1);
	ls.add(2);
	//ls.add(1);//duplicate not allowed
	ls.add(3);
	ls.add(4);
	ls.add(5);
	
	System.out.println(ls);
	
}
}

package collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		HashSet th=new HashSet();
		th.add("B");
		th.add("C");
		th.add("D");
		th.add("Z");
		th.add(null);
		th.add(10);
		System.out.println(th);
	}
	
}

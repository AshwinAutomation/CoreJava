package collection.sortedset;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoTest {
 public static void main(String[] args) {
	SortedSet ss=new TreeSet(Arrays.asList(101,102,103,104,105,106,107,108,109,110));
	System.out.println(ss);
	System.out.println("first elements :"+ ss.first());
	System.out.println("last elements :"+ ss.last());
	System.out.println("headset elements of 105 :"+ ss.headSet(105));
	System.out.println("tailset elements of 105 :"+ ss.tailSet(105));
	System.out.println("subset elements :"+ ss.subSet(103,109));
	
}
}

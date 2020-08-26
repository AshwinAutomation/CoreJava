package variable;

public class Example {

public static void main(String[] args) {
	
	int p=10;
	int q=m1();
	String s1="a";

	
	String s2=new String("a");
	System.out.println("P : " + p);
	System.out.println("q : " + q);
	System.out.println("s1 : " + s1);
	System.out.println("s2 : " + s2);
	Test t=new Test();
	System.out.println("x : " +t.x);
	System.out.println("y : " +t.y);
	
}
static int m1() {
	return 60;
}

}

class Test{
	int x=10;
	int y=20;
}
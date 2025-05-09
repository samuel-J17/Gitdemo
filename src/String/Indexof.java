package String;

public class Indexof {
public static void main(String[] arg) {
	String s1 = "Welcome to Madurai";
	int l= s1.indexOf("e");
	System.out.println(l);
	int l1 = s1.indexOf("Z");
	System.out.println(l1);
	int l2 = s1.indexOf("a");
	System.out.println(l2);
	int l3 = s1.lastIndexOf("a");
	System.out.println(l3);
	
	int l4 = s1.lastIndexOf("e");
	System.out.println(l4);
}
}

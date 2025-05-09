package String;

public class Immutableandmutablestring {
	public static void main(String[] arg) {
		String s1 = "Leo";
		String s2 = "Benjamine";
		String r = s1.concat(s2);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(r);
		
		StringBuffer x1= new StringBuffer("Leo");
		StringBuffer x2= new StringBuffer("Benjamine");
		
		System.out.println(System.identityHashCode(x1));
		System.out.println(System.identityHashCode(x2));
		
	}

}

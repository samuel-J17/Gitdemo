package String;

public class litralandnonlitralstring {
	public static void main(String[] arg) {
		//litral memory
		String s1 = "Benjamine";
		String s2 = "Benjamine";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		//Non-litral memory
		
		String X1 = new String("Benjamine");
		String X2 = new String("Benjamine");
		
		
		System.out.println(System.identityHashCode(X1));
		System.out.println(System.identityHashCode(X2));
		
		
		
		
	}

}

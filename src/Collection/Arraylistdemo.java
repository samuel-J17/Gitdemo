package Collection;

import java.util.ArrayList;

public class Arraylistdemo {

	
	public static void main(String[] args) {
		//can accept duplicate values
		//ArraList,LinkedList, vector - Implementing List interface
		//array have fixed size where as arraylist can grow dynamicaly
		//you can access and insert any value in any index
		ArrayList<String> a	= new ArrayList<String>();
		a.add("Leo");
		a.add("Benjamine");
		a.add("Leo");
		System.out.println(a);
		
		a.add(0, "Engineer");
		
		System.out.println(a);
//		 a.remove(2);
//		 
//		 System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.indexOf("Leo"));
		System.out.println(a.contains("Benjamine"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		
	}
}

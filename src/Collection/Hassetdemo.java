package Collection;

import java.util.HashSet;

public class Hassetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashset, treeset,linkedhasset implement set interface
		//does not accept duplicate values
		//There is no gurantee elements stored in sequenctial order..random order
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("India");
		hs.add("UK");
		hs.add("USA");
		
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
	}

}

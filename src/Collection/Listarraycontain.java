package Collection;

import java.util.ArrayList;
import java.util.List;

public class Listarraycontain {
	
	public static void main(String[] args) {
		
		List<Integer> ex1 = new ArrayList<Integer>();
		
		ex1.add(10);
		ex1.add(20);
		ex1.add(30);
		ex1.add(40);
		ex1.add(50);
		
	boolean y=ex1.contains(30);
	
	System.out.println(y);
	
	boolean x = ex1.contains(100);
	System.out.println(x);
		
		
		
	}

}

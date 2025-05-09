package Collection;

import java.util.ArrayList;
import java.util.List;

public class Listarrayindexbasedadd {
	
	public static void main(String []args) {
		List<Integer> ex1= new ArrayList<Integer>();
		
		ex1.add(10);
		ex1.add(20);
		ex1.add(30);
		ex1.add(40);
		ex1.add(50);
		ex1.add(3, 300);
		ex1.set(4, 400);
		
		System.out.println(ex1);
		
		
	}
}

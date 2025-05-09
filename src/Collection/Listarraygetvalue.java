package Collection;

import java.util.ArrayList;
import java.util.List;

public class Listarraygetvalue {
	public static void main(String[] args) {
		List ex1=new ArrayList<Integer>();
		
		ex1.add(10);
		ex1.add(20);
		ex1.add(30);
		ex1.add(40);
		ex1.add(50);
		
		int i = (int) ex1.get(4);
		
		System.out.println(i);
		
	}

}

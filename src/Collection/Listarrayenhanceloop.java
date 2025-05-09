package Collection;

import java.util.ArrayList;
import java.util.List;

public class Listarrayenhanceloop {
	
	public static void main(String[] args) {
		List<Integer> ex1 =new ArrayList<Integer>();
		
		ex1.add(10);
		ex1.add(20);
		ex1.add(30);
		ex1.add(40);
		ex1.add(50);
		
		for(Integer k:ex1) {
			System.out.println(k);
		}
	}

}

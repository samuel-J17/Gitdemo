package Collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylistforloop {
	public static void main(String[] args) {
		
		List<Integer> ex1 = new ArrayList<Integer>();
		
		ex1.add(10);
		ex1.add(20);
		ex1.add(30);
		ex1.add(40);
		ex1.add(50);
		
		for(int i=0;i<ex1.size();i++) {
//		int i;
//		int f =ex1.get(i);
		
		System.out.println(ex1.get(i));
	}}
}

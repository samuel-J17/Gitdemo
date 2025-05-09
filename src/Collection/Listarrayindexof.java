package Collection;

import java.util.ArrayList;
import java.util.List;

public class Listarrayindexof {
	
	public static void main (String[] arg) {
	
	List<Integer> ex1 = new ArrayList<Integer>();
	
	ex1.add(10);
	ex1.add(20);
	ex1.add(30);
	ex1.add(40);
	ex1.add(50);
	
	int x = ex1.indexOf(40);
	
	System.out.println(x);
	
   int	z=ex1.lastIndexOf(50);
	System.out.println(z);
	
	
	

}
}
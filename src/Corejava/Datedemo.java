package Corejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("m/d/yyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("m/d/yyy hh:mm:ss");
		System.out.println(sdf1.format(d));
		System.out.println(sdf.format(d));
			System.out.println(d.toString());
		
		
		
	}

}

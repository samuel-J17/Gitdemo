package Looping;

public class Innerloop {
	public static void main(String[] args) {//nested loop
		
		int k=1;
		
		for(int i=0; i<4; i++) {
			
			//System.out.println(i);
			for(int j=0; j<4-i; j++) {
				System.out.print( k);
				System.out.print("\t");// this one used the space between number
				k++;
			}
			System.out.println( "");// this one control the step
		}
	}

}

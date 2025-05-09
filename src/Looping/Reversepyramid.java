package Looping;

public class Reversepyramid {
	
	public static void main (String [] args) {
		
int k=1;
		
		for(int i=1; i<5; i++) {
			
			//System.out.println(i);
			for(int j=1; j<=i; j++) {
				System.out.print( k);
				System.out.print("\t");// this one used the space between number
				k++;
			}
			System.out.println( "");// this one control the step
		}
	}



	}



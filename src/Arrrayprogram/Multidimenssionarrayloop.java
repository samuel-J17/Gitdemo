package Arrrayprogram;

public class Multidimenssionarrayloop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a[row] [column]
				int a[] [] = new int[2][3];
				a[0][0]=2;
				a[0][1]=4;
				a[0][2]=5;
				a[1][0]=3;
				a[1][1]=4;
				a[1][2]=7;
				
				for (int i=0; i<2; i++) //outerloop stands for row
				{
				for (int j=0; j<3;j++) {	//innerloop stands for column
					System.out.println(a[i][j]);
				}
				
				} // 2 4 5
				
				  // 3 4 7
	}

}

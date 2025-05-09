package Inheritance;

public class Child extends Parent  {
	
	public void engine() {
		System.out.println("new engine");
	}
	
	public void colour() {
		System.out.println("colour");
	}
	
	
	public static void main(String[] args) {
		Child cd = new Child();
			cd.colour();
			cd.Brake();
		
		
		
	}

}

package Abstracmethod;

public class Childcraft extends Parentaircraft {
	
	public static void main(String[] args) {
		
		Childcraft c = new Childcraft();
		c.bodyClor();
		c.engine();
		c.safetyGuidelines();
		
		
	}

	

	@Override
	public void bodyClor() {
		// TODO Auto-generated method stub
		System.out.println("Red colour on th body");
		
	}

}

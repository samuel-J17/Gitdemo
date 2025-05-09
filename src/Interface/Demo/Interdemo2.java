package Interface.Demo;

public class Interdemo2 implements Interdemo {
	
public void main (String[] args ) {
	
	Interdemo i = new Interdemo2();
	i.Green();
	i.Yellow();
	i.Red();
	
	
}
@Override
public void Green() {
	System.out.println("You can go");
	
}
@Override
public void Red() {
	// TODO Auto-generated method stub
	System.out.println("You can stop");
}

@Override
public void Yellow() {
	// TODO Auto-generated method stub
	System.out.println("You can ready");
	
}

	


}

package polymorphism;

public class CheckPoly extends B {

	public void check() {
		System.out.println("123");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		// To perform down casting we need to do upcasting first
		 A a1=new CheckPoly();
		a1.testA();
		
		// cast Operator for down casting from parent to child
		B b1=(B)a1;
		b1.testB();
		b1.testA();
	
		// cast Operator for down casting from parent to child
		CheckPoly ch1=(CheckPoly)b1;
		ch1.testA();
		ch1.testB();
		ch1.check();   */
		
		
	}

	@Override
	public void testB() {
		// TODO Auto-generated method stub
		
	}
	
	

}

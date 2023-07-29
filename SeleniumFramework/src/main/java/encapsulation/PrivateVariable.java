package encapsulation;

public class PrivateVariable {

	private String a;
	private int b;
	
	// Constructor with class name
	PrivateVariable(String ab){
		System.out.println(getA());
		setA(ab);
		System.out.println(ab);
		System.out.println(getA());
		
		
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		System.out.println("getB()");
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
/*	
	public static void main(String[] args) {
		PrivateVariable pv= new PrivateVariable("Maharastra");
		pv.setA("Pune");
		System.out.println("Access");
		System.out.println(pv.getA());
	}    */

}

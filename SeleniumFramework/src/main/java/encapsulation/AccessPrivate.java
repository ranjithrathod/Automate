package encapsulation;

public class AccessPrivate {

	public static void main(String[] args) {
		
		PrivateVariable pv= new PrivateVariable("Maharastra");
		
		System.out.println(pv.getA());
		pv.setA("Bhosari");
		System.out.println(pv.getA());
		System.out.println(pv.getB());
	}
}

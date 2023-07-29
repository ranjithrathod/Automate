package polymorphism;

interface Inter2 {

	int aa=1;
	public void main1(String sr);

	public void main2();
}


public class ConnInterface implements Inter2 {

	public void main1(String sr) {
		// TODO Auto-generated method stub
		System.out.println("main1 String");
	}

	public void main2() {
		// TODO Auto-generated method stub
		System.out.println("main2 String");
	}

	public static void main(String[] args) {
		ConnInterface ex=new ConnInterface();
		ex.main1("full");
		ex.main2();
		System.out.println(aa);
	}

}

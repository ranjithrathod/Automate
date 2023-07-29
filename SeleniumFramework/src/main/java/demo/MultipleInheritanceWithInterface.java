package demo;

interface Notable{
	void note();
}

interface Printable {  
	void print();  
} 

interface Showable extends Printable,Notable{  
	void show();  
}  


public class MultipleInheritanceWithInterface implements Showable{

	public void print()
	{
		System.out.println("Hello");
	}  
	public void show()
	{
		System.out.println("Welcome--5");
	} 
	
	public void note() {
		System.out.println("note mothed");
	}

	public static void main(String[] args) {

		MultipleInheritanceWithInterface m1=new MultipleInheritanceWithInterface();

		m1.toString();
		m1.print();
		m1.show();
		m1.note();
	}
}

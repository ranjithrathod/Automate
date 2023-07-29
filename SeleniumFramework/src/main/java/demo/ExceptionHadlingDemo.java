package demo;

public class ExceptionHadlingDemo {

	public static void main(String[] args){

	/*	try {
			System.out.println("hello world...!");
			int i=1/0;
			System.out.println("Completed");
		}
		catch(Exception exp){
			System.out.println("inside Catch bolck");
			System.out.println("Message is : "	+exp);
			System.out.println("cause : " +exp);
			exp.getStackTrace();
		}    */
		try {
			demo();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void demo() throws Exception {
		System.out.println("hello world...!");
		int i=1/0;
		System.out.println("Completed");
		
	}


}



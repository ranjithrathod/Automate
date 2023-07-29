package demo;

import java.io.PrintWriter;

public class Exceptions {
	
	public int ab=150;
	private char[] a;
	

	public static void main(String[] args) {
		
		String a="Singh";
		System.out.println(a);
	
	/*	String s=null;
		try {
		System.out.println(s.length());//NullPointerException  
		}
		catch (Exception exp) {
		
			System.out.println("null ponter exception is handled");
		}   
 
		String s="abc";  
		int i=Integer.parseInt(s);//NumberFormatException 
		try {
		 int data=50/0; //may throw exception   
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			 System.out.println("rest of the code");
		}    */
	         
	
		Exceptions obj= new Exceptions();
		System.out.println(obj.a);
		String b = "Sher";
		System.out.println(b);
		
	}

}

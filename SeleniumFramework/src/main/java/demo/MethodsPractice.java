package demo;

import demo.Exceptions;
public class MethodsPractice {

	
	public static void main(String[] args) {
		String a = "1r";
		MethodsPractice mp=new MethodsPractice();
		System.out.println(mp);
	
		
		add(5000000, 6000000, 7000000);
		max(25, 50, 7);
		max2(1500, 200, 1000);
		evenOdd(15);
		evenOdd(16);
		evenOdd(60);
		Exceptions obj= new Exceptions();
		System.out.println(obj.ab);
	}
	
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
		 
	}
	
	public static void max(int a,int b,int c) {
		if(a>b) {
			System.out.println(a);
		}
		else if(b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}
	
	public static void max2(int a,int b,int c) {
		int i=(a>b&&a>c?a : b>c?b : c);
		System.out.println(i);
	}

	public static void evenOdd(int a) {
		
		if(a%2==0) {
			System.out.println(a+" even");
		}
		else {
			System.out.println(a+ " odd");
		}
		
	}
	

	
  

}

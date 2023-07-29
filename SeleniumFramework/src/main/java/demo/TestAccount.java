package demo;

public class TestAccount {

	public static void main(String[] args){  
		Account a1=new Account();  
		a1.insert(622467523,"Ankit",1000);  
		a1.display();  
		a1.checkBalance();  
		a1.deposit(40000);  
		a1.checkBalance();  
		a1.withdraw(15);  
		a1.checkBalance(); 
		a1.display();
		}
}

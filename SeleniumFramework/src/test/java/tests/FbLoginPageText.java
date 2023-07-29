package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.FbLoginPage;

public class FbLoginPageText {
	
	private static WebDriver driver=null;

	public static void main(String[] args) {
		fbLoginTest();
		
	}

	public static void fbLoginTest() {
		
		driver=new FirefoxDriver();
		
		//Creating object for FbLoginPage 
		FbLoginPage fbLoginObject= new FbLoginPage(driver);
		
		driver.get("https://www.facebook.com/login/");
		
		fbLoginObject.setUsernameTextbox("dgfjdgfdhjgh");
		fbLoginObject.setPasswordTextbox("rdytdr4645");  
		fbLoginObject.clickLoginButton();
		
		
		
		
	}
}

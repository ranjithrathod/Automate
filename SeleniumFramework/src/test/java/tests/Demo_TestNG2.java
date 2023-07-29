package tests;


import org.testng.annotations.Test;

import config.PorpertiesFile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.GoogleSearchPage;//imported page of components class


public class Demo_TestNG2 {

	static WebDriver driver=null;
	
	public static String browserName=null;
    @BeforeTest
	public void setUpTest() {
    	
    	PorpertiesFile.getProperties();
    	
    	if(browserName.equalsIgnoreCase("firefox")){
		driver=new FirefoxDriver();
    	}
    	else if(browserName.equalsIgnoreCase("chrome")){
		driver=new ChromeDriver();
    	}
	}

    @Test
	public  void googleSearch2() {
	
		driver.get("https://www.google.com/");

		GoogleSearchPage.searchTextbox(driver).sendKeys("Facebook");
		GoogleSearchPage.searchTextbox(driver).sendKeys(Keys.ENTER);

		driver.navigate().to("https://www.facebook.com/login/");

		GoogleSearchPage.usn(driver).sendKeys("fgshfdkshgj");
		GoogleSearchPage.pwd(driver).sendKeys("hfk345hjbh");
		GoogleSearchPage.button(driver).click();
		
	}
	
    @AfterTest
	public void tearDownTest() {
		
		driver.quit();
		System.out.println("tested Successfully22");
		PorpertiesFile.setProperties();
	}
}

package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;  //imported page class of components

public class Demo_TestNG {

	static WebDriver driver=null;
    @BeforeTest
	public void setUpTest() {
		driver=new FirefoxDriver();
	}

    @Test
	public  void googleSearch() {
	
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
		System.out.println("tested Successfully");
	}
}

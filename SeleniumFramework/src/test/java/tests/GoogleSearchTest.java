package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {

	static WebDriver	driver=null;

	public static void main(String[] args) {

		googleSearch();

	}

	public static void googleSearch() {

		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");

		GoogleSearchPage.searchTextbox(driver).sendKeys("Facebook");
		GoogleSearchPage.searchTextbox(driver).sendKeys(Keys.ENTER);

		driver.navigate().to("https://www.facebook.com/login/");

		GoogleSearchPage.usn(driver).sendKeys("fgshfdkshgj");
		GoogleSearchPage.pwd(driver).sendKeys("hfk345hjbh");
		GoogleSearchPage.button(driver).click();

	}
}

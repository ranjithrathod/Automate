package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element=null;

	//Google Saerch Textbox
	public static WebElement searchTextbox(WebDriver driver) {
		element=driver.findElement(By.name("q"));
		return element; 
	}
	
	// Facebook Login page Components
	//username textbox
	public static WebElement usn(WebDriver driver) {
		element=driver.findElement(By.name("email"));
		return element; 
	}
	
	//password textbox
	public static WebElement pwd(WebDriver driver) {
		element=driver.findElement(By.name("pass"));
		return element; 
	}
	
	//login button
	public static WebElement button(WebDriver driver) {
		element=driver.findElement(By.name("login"));
		return element; 
	}
}

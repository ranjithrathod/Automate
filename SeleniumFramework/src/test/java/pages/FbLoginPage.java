package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbLoginPage {
	
	WebDriver driver=null;
	
	By usn_textbox = By.name("email");
	By pwd_textbox = By.name("pass");
	By login_button = By.name("login");
	
	//constructor to reach the webdriver
	public FbLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setUsernameTextbox(String text) {
		driver.findElement(usn_textbox).sendKeys(text);
	}
	
	public void setPasswordTextbox(String text) {
		driver.findElement(pwd_textbox).sendKeys(text);
	}
	
	public void clickLoginButton() {
		driver.findElement(login_button).click();
	}

}

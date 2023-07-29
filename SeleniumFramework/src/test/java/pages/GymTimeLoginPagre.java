package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GymTimeLoginPagre {

	private static WebElement element=null;
	//user name text box
	public static WebElement usn_Textbox(WebDriver driver) {
		element= driver.findElement(By.name("txtUserName"));
		return element;
	}
	//password Text box
	public static WebElement pwd_Textbox(WebDriver driver) {
		element= driver.findElement(By.name("txtPassword"));
		return element;
	}
	//OTP text box
	public static WebElement otp_Textbox(WebDriver driver) {
		element= driver.findElement(By.name("txtOtp"));
		return element;
	}
	//Login Button
	public static WebElement login_Button(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		return element;
	}
	
	//Check In
	public static WebElement checkIn(WebDriver driver) {
		element= driver.findElement(By.id("homeID"));
		return element;	
	}
	
	
	
	
	
}

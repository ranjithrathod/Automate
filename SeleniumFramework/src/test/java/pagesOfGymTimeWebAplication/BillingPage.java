package pagesOfGymTimeWebAplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingPage {

	private static WebElement element=null;
	
	public static WebElement pkjType_Dropdown(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlPackageType\"]"));
		return element;
	}
	
	public static WebElement pkjName_Dropdown(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlPackageName\"]"));
		return element;
	}
	
	public static WebElement instructor_Dropdown(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlInstructorName\"]"));
		return element;
	}
	
	public static WebElement time_Dropdown(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlTime\"]"));
		return element;
	}
	
	public static WebElement discount_Textbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtDiscount\"]"));
		return element;
	}
	
	public static WebElement regFees_Dropdown(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtRegistrationFees\"]"));
		return element;
	}
	
	public static WebElement discReason_Textbox(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtDiscReason\"]"));
		return element;
	}
	
	
	public static WebElement paymentMode_Dropdown(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlpaymentMode\"]"));
		return element;
	}

	public static WebElement payDetails_Textbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtPaymentDetails\"]"));
		return element;
	}
	
	
}








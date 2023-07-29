package pagesOfGymTimeWebAplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddMemberPage {
	
	private static WebElement element;
	
	public static WebElement member_Link(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"GymtimeMenuEnrollment\"]/div/a[1]"));
		return element;
	}
	
	public static WebElement registrationDate(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMemberRegistrationDate\"]"));
		return element;
	}
	
	public static WebElement name_Textbox(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMemberName\"]"));
		return element;
	}
	
	public static WebElement contact_Textbox(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMemberContact\"]"));
		return element;
	}
	
	public static WebElement whatsappNo_Textbox(WebDriver driver) {
		element=driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtWhatsAppNo"));
		return element;
	}
	
	public static WebElement gender_Dropdown(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlgender\"]"));
		return element;
	}
	
	public static WebElement email_Textbox(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMemberEmail\"]"));
		return element;
	}
	
	public static WebElement address_Textbox(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMemberAddress\"]"));
		return element;
	}
	
	public static WebElement emergencyContact_Textbox(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtEmergencyContact\"]"));
		return element;
	}

	public static WebElement dob_Textbox(WebDriver driver) {
		element=driver.findElement(By.xpath("//input[@tabindex='9']"));
		return element;
	}
	
	public static WebElement bloodGroup_Dropdown(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlBloodGroup\"]"));
		return element;
	}
	
	public static WebElement Occupation_Dropdown(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlMemberOccupation\"]"));
		return element;
	}
	
	public static WebElement gst_Textbox(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtgstNumber\"]"));
		return element;
	}
	
	public static WebElement remove_Button(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@tabindex=\"19\"]"));
		return element;
	}
	
	public static WebElement memberExecuive_Dropdown(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlMemberExecutive\"]"));
		return element;
	}
	
	public static WebElement next_Button(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnSubmitMember\"]"));
		return element;
	}
	
	
	
	
	
	
	
	
	
	
}	
	




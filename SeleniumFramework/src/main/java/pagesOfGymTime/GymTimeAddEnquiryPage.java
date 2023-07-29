package pagesOfGymTime;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GymTimeAddEnquiryPage {

	private static WebElement element= null;
	
	//click on Enquiry Link
	public static WebElement enquiry_Link(WebDriver driver) {
		element= driver.findElement(By.xpath("//a[@href='Frm_AddEnquiry.aspx']"));
		return element;
	}
	//Date 
	public static WebElement date_Textbox(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtDAte\"]"));
		return element;
	}
	
	public static WebElement name_Textbox(WebDriver driver) {
		element= driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtname"));
		return element;
	}
	
	public static WebElement gender_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlgender']"));
		Select gDropdown = new Select(element);
		gDropdown.selectByVisibleText("Male");
		return element;
	}

	/*
	public static WebElement email_Textbox(WebDriver driver) {
		element= driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtEmail"));
		return element;
	}
	
	public static WebElement contact_Textbox(WebDriver driver) {
		element= driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtContact"));
		return element;
	}
	
	public static WebElement dob_Textbox(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtDob\"]"));
		return element;
	}
	
	public static WebElement bloodGroup_Textbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlbdgroup\"]"));
		Select bgroup = new Select(element);
		bgroup.selectByVisibleText("B+");
		return element;
	}
	
	public static WebElement location_Textbox(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtlocation\"]"));
		return element;
	}
	
	public static WebElement address_Textbox(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtAddress\"]"));
		return element;
	}
	
	public static WebElement occupation_Textbox(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddloccupation\"]"));
		return element;
	}        */
	
	
	
	
}

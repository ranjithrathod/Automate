package pagesOfGymTimeWebAplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewEnquiryPage {

	static WebElement element;
	
	public static WebElement enquiryEye_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"GymtimeMenuLead\"]/div/a[2]"));
		return element;
	}

	public static WebElement fromDate(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtfrmDAte\"]"));
		return element;
	}
	
	public static WebElement toDate(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtTodate\"]"));
		return element;
	}
	
	public static WebElement dateWiseSearch_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlDateWiseSearch\"]"));
		return element;
	}
	
	public static WebElement rating_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlRating\"]"));
		return element;
	}
	
	public static WebElement enquiryFor_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlEnquiryFor\"]"));
		return element;
	}
	
	public static WebElement sOfEnquiry_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlSourcesOfEnquiry\"]"));
		return element;
	}
	
	public static WebElement gender_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlGender\"]"));
		return element;
	}
	
	public static WebElement enquiryType_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlEnquiryType\"]"));
		return element;
	}
	
	public static WebElement location_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlLocation\"]"));
		return element;
	}
	
	public static WebElement Occupation_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlOccupation\"]"));
		return element;
	}
	
	public static WebElement executiveName_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlExecutiveName\"]"));
		return element;
	}
	
	public static WebElement callResponse_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlExecutiveName\"]"));
		return element;
	}
	
	public static WebElement search_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnSearch\"]"));
		return element;
	}
	
	
	
	
	
	
	
      

}

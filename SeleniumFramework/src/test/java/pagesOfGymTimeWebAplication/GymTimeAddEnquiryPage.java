package pagesOfGymTimeWebAplication;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GymTimeAddEnquiryPage {

	private static WebElement element= null;
	
	//click on Enquiry Link
	public static WebElement enquiry_Link(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"GymtimeMenuLead\"]/div/a[1]"));
		return element;
	}
/*	//Date 
	public static WebElement date_Textbox(WebDriver driver) {
	//	Alert alt = driver.switchTo().alert();
	//	alt.accept();
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtDAte\"]"));
		return element;
	}            */
	
	public static WebElement name_Textbox(WebDriver driver) {
		element= driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtname"));
		return element;
	}
	
	public static WebElement gender_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlgender']"));
	//	Select gDropdown = new Select(element);
	//	gDropdown.selectByVisibleText("Male");
		return element;
	}

	
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
	
	public static WebElement bloodGroup_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlbdgroup\"]"));
	//	Select bgroup = new Select(element);
	//	bgroup.selectByVisibleText("B+");
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
	
	public static WebElement occupation_Dropdown(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddloccupation\"]"));
		return element;
	}        

	public static WebElement enqType_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlenqtype\"]"));
	//	Select etype = new Select(element);
	//	etype.selectByVisibleText("Walkin");
		return element;
	}  
	
	public static WebElement enqFor_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlEnqfor\"]"));
	//	Select etype = new Select(element);
	//	etype.selectByVisibleText("Gym");
		return element;
	}
	
	public static WebElement sofEnquiry_Dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlsenq\"]"));
	//	Select etype = new Select(element);
	//	etype.selectByVisibleText("Friends");
		return element;
	}
	
	public static WebElement referBy_Textbox(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtreffer\"]"));
		return element;
	}
	
	public static WebElement rating_Dropdown(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlRating\"]"));
		return element;
	}
	
	public static WebElement callResponse_Dropdown(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlcallresponse\"]"));
		return element;
	}
	
	public static WebElement budget_Textbox(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtbudget\"]"));
		return element;
	}
	
	public static WebElement nextFollowupDate_Textbox(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtnfdate\"]"));
		return element;
	}
	
	public static WebElement remove_Button(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnRemove\"]"));
		return element;
	}
	
	public static WebElement comment_TestArea(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtcomment\"]"));
		return element;
	}
	
	public static WebElement save_Button(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnsave\"]"));
		return element;
	}
	
	
	
	
	
}

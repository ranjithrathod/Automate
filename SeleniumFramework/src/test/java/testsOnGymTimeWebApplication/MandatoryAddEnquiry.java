package testsOnGymTimeWebApplication;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;           
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import pagesOfGymTimeWebAplication.LoginGymTime;
import pagesOfGymTimeWebAplication.GymTimeAddEnquiryPage;

public class MandatoryAddEnquiry {

	static WebDriver driver=null;


	@BeforeTest
	public void setUpTest() {

		//	driver= new FirefoxDriver();

		//	driver= new InternetExplorerDriver();
		driver=new ChromeDriver();

		//	driver = new EdgeDriver();

		//	 driver= new SafariDriver();	

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	@org.testng.annotations.Test
	public void loginPage() throws InterruptedException {
		driver.get("http://103.156.21.183:8069/Frm_Login.aspx");
		LoginGymTime.usn_Textbox(driver).sendKeys("Rtest");
		LoginGymTime.usn_Textbox(driver).sendKeys(Keys.TAB);
		Thread.sleep(1000); 
		LoginGymTime.pwd_Textbox(driver).sendKeys("Rtest");
		LoginGymTime.pwd_Textbox(driver).sendKeys(Keys.TAB);

		Thread.sleep(1000);
		LoginGymTime.otp_Textbox(driver).sendKeys("1124");
		LoginGymTime.otp_Textbox(driver).sendKeys(Keys.TAB);
		//	Thread.sleep(1000);
		LoginGymTime.login_Button(driver).click();
		//	Thread.sleep(1000);
		LoginGymTime.checkIn(driver).click();
		//	Thread.sleep(1000);
		GymTimeAddEnquiryPage.enquiry_Link(driver).click();
	}


	/*
	public static void main(String[] args) throws IOException {

		loginGymtime();

		String excelPath = "C:\\Users\\admin\\Desktop\\AutomationWorkspace\\SeleniumFramework\\excel\\testData.xlsx";
		testData(excelPath, "Sheet1");
	}         

	@org.testng.annotations.Test
	public static void loginGymtime() {

		LoginGymTime.usn_Textbox(driver).sendKeys("ranjith");
		LoginGymTime.pwd_Textbox(driver).sendKeys("ranjith");
		LoginGymTime.otp_Textbox(driver).sendKeys("1124");
		LoginGymTime.login_Button(driver).click();
		LoginGymTime.checkIn(driver).click();

	}       */

	@org.testng.annotations.Test(dataProvider = "test1Data")
	public void test1(String Name, String Gender,/* String Email,*/String Contact,/*,String dobMonthYear,String dobDay,String BloodGroup,String Address, String Occupation,String EnquiryType,String EnquiryFor,String ReferBy,*/ String Rating,/*String Budget,*/ String Comment) throws Throwable {

		System.out.println(Name+ " | " +Gender+" | "/*+ Email+" | "*/+ Contact+" | "+/*dobMonthYear+" | "+dobDay+" | "+BloodGroup+" | "+ Address+" | "+Occupation+" | "+ ReferBy+" | "+*/ Rating+" | "/*+Budget+" | "*/+ Comment);
		//	Thread.sleep(2000);

		WebElement date = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtDAte\"]"));
		date.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		GymTimeAddEnquiryPage.name_Textbox(driver).sendKeys(Name);
		WebElement genderDD = GymTimeAddEnquiryPage.gender_Dropdown(driver);
		genderDD.click();
		Select gDropdown = new Select(genderDD);
		for(int i=0; i<3; i++) {
			if(Gender.equalsIgnoreCase("Male")) {
				gDropdown.selectByVisibleText("Male");
			}
			else if(Gender.equalsIgnoreCase("Female")) {
				gDropdown.selectByVisibleText("Female");
			}
			else {
				gDropdown.selectByVisibleText("Other");
			}  
		}

		//---------> 	GymTimeAddEnquiryPage.email_Textbox(driver).sendKeys(Email);
		GymTimeAddEnquiryPage.email_Textbox(driver).sendKeys(Keys.TAB);

		//   String stringValue = Double.toString(Contact);
		//  GymTimeAddEnquiryPage.contact_Textbox(driver).sendKeys(stringValue);

		GymTimeAddEnquiryPage.contact_Textbox(driver).sendKeys(Contact);
		Thread.sleep(1000);
		GymTimeAddEnquiryPage.dob_Textbox(driver).sendKeys(Keys.TAB);


		/*       String month =dobMonthYear;
        String dobDate = dobDay;


       driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtDob\"]")).click();
       // loop to get month and year
       while(true) {
       	String monthYear = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_CalendarExtender4_title\"]")).getText();
       	if(monthYear.equalsIgnoreCase(month)) {
       		break;
       	}	
       	else {
       	driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_CalendarExtender4_prevArrow\"]")).click();
       	}
       }
       //all dates elements
       List<WebElement> alldates = driver.findElements(By.xpath("//*[@id=\"ContentPlaceHolder1_CalendarExtender4_daysTable\"]//td"));
     // loop to click on a particular date from calendar
       for(WebElement ele:alldates) {    	   
   	   String dt = ele.getText();   
   	   if(dt.equals(dobDate))
   	   { 
   		   ele.click(); 
   		   break;
   	   }

      }
		 */


		/*   ----->	Thread.sleep(1000);
		WebElement bGroup = GymTimeAddEnquiryPage.bloodGroup_Dropdown(driver);
		bGroup.click();
		Select bloodG=new Select(bGroup);
		for(int i=0; i<9; i++) {
			if(BloodGroup.equalsIgnoreCase("NA")) {
				bloodG.selectByVisibleText("NA");
			}
			else if(BloodGroup.equalsIgnoreCase("A+")) {
				bloodG.selectByVisibleText("A+");
			}
			else if(BloodGroup.equalsIgnoreCase("A-")) {
				bloodG.selectByVisibleText("A-");
			}
			else if(BloodGroup.equalsIgnoreCase("AB+")) {
				bloodG.selectByVisibleText("AB+");
			}
			else if(BloodGroup.equalsIgnoreCase("AB-")) {
				bloodG.selectByVisibleText("AB-");

			}
			else if(BloodGroup.equalsIgnoreCase("B+")) {
				bloodG.selectByVisibleText("B+");
			}
			else if(BloodGroup.equalsIgnoreCase("B-")) {
				bloodG.selectByVisibleText("B-");
			}
			else if(BloodGroup.equalsIgnoreCase("O+")) {
				bloodG.selectByVisibleText("O+");
			}
			else if(BloodGroup.equalsIgnoreCase("O-")) {
				bloodG.selectByVisibleText("O-");
			}
			else {
				System.out.println("Invalid Blood Group, please give valid input(in excel)!!!  ");
			}

		}    ---->  */
		Thread.sleep(1000);
		GymTimeAddEnquiryPage.bloodGroup_Dropdown(driver).sendKeys(Keys.TAB);
		//     ----->	Thread.sleep(1000);
		GymTimeAddEnquiryPage.location_Textbox(driver).sendKeys(Keys.TAB);

		GymTimeAddEnquiryPage.address_Textbox(driver).sendKeys(Keys.TAB);

		GymTimeAddEnquiryPage.occupation_Dropdown(driver).sendKeys(Keys.TAB);

		/*    ------>	WebElement occ = GymTimeAddEnquiryPage.occupation_Dropdown(driver);
		occ.click();
		Select selectOcc = new Select(occ);
		for(int i=0; i<9;i++) {
			if(Occupation.equalsIgnoreCase("Student")) {
				selectOcc.selectByVisibleText("Student");
			}
			else if(Occupation.equalsIgnoreCase("Service")) {
				selectOcc.selectByVisibleText("Service");
			}
			else if(Occupation.equalsIgnoreCase("Business")) {
				selectOcc.selectByVisibleText("Business");
			}
			else if(Occupation.equalsIgnoreCase("Housewife")) {
				selectOcc.selectByVisibleText("Housewife");
			}
			else if(Occupation.equalsIgnoreCase("Doctor")) {
				selectOcc.selectByVisibleText("Doctor");
			}
			else if(Occupation.equalsIgnoreCase("Job")) {
				selectOcc.selectByVisibleText("Job");
			}
		/*	else if(Occupation.equalsIgnoreCase("Software Engineer ")) {
				selectOcc.selectByVisibleText("Software Engineer ");
			}
			else if(Occupation.equalsIgnoreCase("Developer")) {
				selectOcc.selectByVisibleText("Developer");
			}
			else if(Occupation.equalsIgnoreCase("Self employed")) {
				selectOcc.selectByVisibleText("Self employed");
			}
			else if(Occupation.equalsIgnoreCase("Test ")) {
				selectOcc.selectByVisibleText("Test ");
			}           
			else {
				System.out.println("Invalid Occupation, please give valid input(in excel)!!!  ");
			}
		}      */

		GymTimeAddEnquiryPage.enqType_Dropdown(driver).sendKeys(Keys.TAB);

		GymTimeAddEnquiryPage.enqFor_Dropdown(driver).sendKeys(Keys.TAB);

		GymTimeAddEnquiryPage.sofEnquiry_Dropdown(driver).sendKeys(Keys.TAB);

		GymTimeAddEnquiryPage.referBy_Textbox(driver).sendKeys(Keys.TAB);

		WebElement rate = GymTimeAddEnquiryPage.rating_Dropdown(driver);
		rate.click();
		Select select = new Select(rate);
		for(int i=0; i<6; i++) {
			if(Rating.equalsIgnoreCase("Cold")) {
				select.selectByVisibleText("Cold");
			}
			else if(Rating.equalsIgnoreCase("Warm")) {
				select.selectByVisibleText("Warm");
			}
			else if(Rating.equalsIgnoreCase("Hot")) {
				select.selectByVisibleText("Hot");
			}
			else if(Rating.equalsIgnoreCase("Expected")) {
				select.selectByVisibleText("Expected");
			}
			else if(Rating.equalsIgnoreCase("Not Interested"))
			{
				select.selectByVisibleText("Not Interested");

				//	System.out.println("candidate is not interested");
				//	driver.navigate().refresh();
			}

		}


		GymTimeAddEnquiryPage.callResponse_Dropdown(driver).sendKeys(Keys.TAB);
		//--------> 	Thread.sleep(1000);
		GymTimeAddEnquiryPage.budget_Textbox(driver).sendKeys(Keys.TAB);


		//	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//    wait.until(ExpectedConditions.visibilityOf(GymTimeAddEnquiryPage.nextFollowupDate_Textbox(driver)));
		//	Thread.sleep(1000);
		//	GymTimeAddEnquiryPage.nextFollowupDate_Textbox(driver).sendKeys(Keys.TAB);       

		GymTimeAddEnquiryPage.remove_Button(driver).sendKeys(Keys.TAB);
		//-------->		Thread.sleep(1000);
		GymTimeAddEnquiryPage.comment_TestArea(driver).sendKeys(Comment);
		GymTimeAddEnquiryPage.comment_TestArea(driver).sendKeys(Keys.TAB);
		//------->	Thread.sleep(2000);
		GymTimeAddEnquiryPage.save_Button(driver).click();

		//	 driver.navigate().refresh();

	}

	@DataProvider(name ="test1Data")
	public  Object[][] getData() {

		String excelPath = "C:\\Users\\admin\\Desktop\\AutomationWorkspace\\SeleniumFramework\\excel\\testData.xlsx";
		Object data[][]=testData(excelPath, "Sheet3");
		return data;
	}

	public static Object[][] testData(String excelPath, String sheetName) {

		GymTimeUtils excel = new GymTimeUtils(excelPath, sheetName);

		int rowCount=GymTimeUtils.getRowCount();
		int colCount=GymTimeUtils.getColumnCount();

		Object data[][]=new Object[rowCount-1][colCount];

		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {

				String cellDataString = excel.getCellDataString(i, j);
				//	System.out.print(cellDataString+" | ");
				data[i-1][j]=cellDataString;
			}  
			//	System.out.println();
		}
		return data;


	}

}

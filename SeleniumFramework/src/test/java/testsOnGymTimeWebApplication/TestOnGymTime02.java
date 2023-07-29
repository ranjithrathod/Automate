package testsOnGymTimeWebApplication;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import pagesOfGymTimeWebAplication.LoginGymTime;
import pagesOfGymTimeWebAplication.GymTimeAddEnquiryPage;

public class TestOnGymTime02 {

	static WebDriver driver=null;

	public static void main(String[] args) {
		setUpTest();
	}
	public static void setUpTest() {

		driver= new FirefoxDriver();

	}


	public static void loginPage() throws InterruptedException {
		driver.get("http://103.156.21.183:8066/Frm_Login.aspx");
		LoginGymTime.usn_Textbox(driver).sendKeys("ranjith");
		LoginGymTime.usn_Textbox(driver).sendKeys(Keys.TAB);

		LoginGymTime.pwd_Textbox(driver).sendKeys("ranjith");
		LoginGymTime.pwd_Textbox(driver).sendKeys(Keys.TAB);

		Thread.sleep(2000);
		LoginGymTime.otp_Textbox(driver).sendKeys("1124");
		LoginGymTime.otp_Textbox(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		LoginGymTime.login_Button(driver).click();
		LoginGymTime.checkIn(driver).click();
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


	public static void test1(String Name, String Gender, String Email,String BloodGroup,String dobMonthYear,String dobDay, String Occupation,String EnquiryType,String EnquiryFor, String SourceOfEnquiry,String Rating,String CallResponse) throws InterruptedException {

		//	System.out.println(Name+ " | " +Gender+" | "+ Email);
		GymTimeAddEnquiryPage.enquiry_Link(driver).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
	//	GymTimeAddEnquiryPage.date_Textbox(driver).sendKeys(Keys.TAB);
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
		}

		GymTimeAddEnquiryPage.email_Textbox(driver).sendKeys(Email); 
		
		
		 String month =dobMonthYear;
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

		}

		WebElement occ = GymTimeAddEnquiryPage.occupation_Dropdown(driver);
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
			else if(Occupation.equalsIgnoreCase("Software Engineer ")) {
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
		}

		WebElement etype = GymTimeAddEnquiryPage.enqType_Dropdown(driver);
		etype.click();
		Select selectEnqType=new Select(etype);
		for(int i=0;i<6;i++) {
			if(EnquiryType.equalsIgnoreCase("NA")) {
				selectEnqType.selectByVisibleText("NA");
			}
			else if(EnquiryType.equalsIgnoreCase("Walkin")) {
				selectEnqType.selectByVisibleText("Walkin");
			}
			else if(EnquiryType.equalsIgnoreCase("Telephonic")) {
				selectEnqType.selectByVisibleText("Telephonic");
			}
			else if(EnquiryType.equalsIgnoreCase("Email")) {
				selectEnqType.selectByVisibleText("Email");
			}
			else if(EnquiryType.equalsIgnoreCase("Whatsapp message ")) {
				selectEnqType.selectByVisibleText("Whatsapp message ");
			}
			else if(EnquiryType.equalsIgnoreCase("Instagram Followers")) {
				selectEnqType.selectByVisibleText("Instagram Followers");
			}
			else {
				System.out.println("Invalid Enquiry Type, please give valid input(in excel)!!!  ");
			}

		}

		WebElement eFor = GymTimeAddEnquiryPage.enqFor_Dropdown(driver);
		eFor.click();
		Select selectEnqFor = new Select(eFor);
		for(int i=0;i<7;i++) {
			if(EnquiryFor.equalsIgnoreCase("NA")) {
				selectEnqFor.selectByVisibleText("NA");
			}
			else if(EnquiryFor.equalsIgnoreCase("Gym")) {
				selectEnqFor.selectByVisibleText("Gym");
			}
			else if(EnquiryFor.equalsIgnoreCase("Zumba")) {
				selectEnqFor.selectByVisibleText("Zumba");
			}
			else if(EnquiryFor.equalsIgnoreCase("PT")) {
				selectEnqFor.selectByVisibleText("PT");
			}
			else if(EnquiryFor.equalsIgnoreCase("Gym+Cardio")) {
				selectEnqFor.selectByVisibleText("Gym+Cardio");
			}
			else if(EnquiryFor.equalsIgnoreCase("Cardio")) {
				selectEnqFor.selectByVisibleText("Cardio");
			}
			else if(EnquiryFor.equalsIgnoreCase("Yoga")) {
				selectEnqFor.selectByVisibleText("Yoga");
			}
			else {
				System.out.println("Invalid Enquiry For, please give valid input(in excel)!!!  ");
			}

		}

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
			else {
				select.selectByVisibleText("Not Interested");
			}
		}

		WebElement soEnq = GymTimeAddEnquiryPage.sofEnquiry_Dropdown(driver);
		soEnq.click();
		Select selectSourceOfEnq = new Select(soEnq);
		for(int i=0;i<8;i++) {
			if(SourceOfEnquiry.equalsIgnoreCase("NA")) {
				selectSourceOfEnq.selectByVisibleText("NA");
			}
			else  if(SourceOfEnquiry.equalsIgnoreCase("VISITOR ")) {
				selectSourceOfEnq.selectByVisibleText("VISITOR ");
			}
			else  if(SourceOfEnquiry.equalsIgnoreCase("Just Dial")) {
				selectSourceOfEnq.selectByVisibleText("Just Dial");
			}
			else if(SourceOfEnquiry.equalsIgnoreCase("Flyers")) {
				selectSourceOfEnq.selectByVisibleText("Flyers");
			}
			else  if(SourceOfEnquiry.equalsIgnoreCase("Hording")) {
				selectSourceOfEnq.selectByVisibleText("Hording");
			}
			else if(SourceOfEnquiry.equalsIgnoreCase("Passing By")) {
				selectSourceOfEnq.selectByVisibleText("Passing By");
			}
			else if(SourceOfEnquiry.equalsIgnoreCase("Friends")) {
				selectSourceOfEnq.selectByVisibleText("Friends");
			}
			else if(SourceOfEnquiry.equalsIgnoreCase("Social Media")) {
				selectSourceOfEnq.selectByVisibleText("Social Media");
			}
			else {
				System.out.println("Invalid Source Of Enquiry, please give valid input(in excel)!!!  ");
			}

		}

		WebElement callResp = GymTimeAddEnquiryPage.callResponse_Dropdown(driver);
		callResp.click();
		Select selectCallResponce = new Select(callResp);
		for(int i=0;i<8;i++) {
			if(CallResponse.equalsIgnoreCase("NA")) {
				selectCallResponce.selectByVisibleText("NA");
			}
			else if(CallResponse.equalsIgnoreCase("Received")) {
				selectCallResponce.selectByVisibleText("Received");
			}
			else if(CallResponse.equalsIgnoreCase("Switch Off")) {
				selectCallResponce.selectByVisibleText("Switch Off");
			}
			else if(CallResponse.equalsIgnoreCase("Visited")) {
				selectCallResponce.selectByVisibleText("Visited");
			}
			else if(CallResponse.equalsIgnoreCase("Wrong Number")) {
				selectCallResponce.selectByVisibleText("Wrong Number");
			}
			else if(CallResponse.equalsIgnoreCase("Busy")) {
				selectCallResponce.selectByVisibleText("Busy");
			}
			else if(CallResponse.equalsIgnoreCase("Cut")) {
				selectCallResponce.selectByVisibleText("Cut");
			}
			else if(CallResponse.equalsIgnoreCase("Ringing")) {
				selectCallResponce.selectByVisibleText("Ringing");
			}
			else {
				System.out.println("Invalid Call Response, please give valid input(in excel)!!!  ");
			}
		}


	}


	public static  Object[][] getData() {

		String excelPath = "C:\\Users\\admin\\Desktop\\AutomationWorkspace\\SeleniumFramework\\excel\\testData.xlsx";
		Object data[][]=testData(excelPath, "Sheet1");
		String Name;
		return data;
	}

	public static Object[][] testData(String excelPath, String sheetName) {

		GymTimeUtils excel = new GymTimeUtils(excelPath, sheetName);

		int rowCount=GymTimeUtils.getRowCount();
		int colCount=GymTimeUtils.getColumnCount();

		Object data[][]=new Object[rowCount-1][colCount];

		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData+" | ");
				data[i-1][j]=cellData;
				/*		
			public static  equiry(String Name, String Gender, String Email) {	
				Thread.sleep(2000);
				Alert alt = driver.switchTo().alert();
				alt.accept();
				GymTimeAddEnquiryPage.date_Textbox(driver).sendKeys(Keys.TAB);
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
			   }

			   GymTimeAddEnquiryPage.email_Textbox(driver).sendKeys(Email);

			}
				 */
			}  
			System.out.println();
		}
		return data;


	}

}

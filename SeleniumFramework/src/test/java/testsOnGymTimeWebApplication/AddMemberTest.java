package testsOnGymTimeWebApplication;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesOfGymTimeWebAplication.LoginGymTime;
import pagesOfGymTimeWebAplication.AddMemberPage;
import pagesOfGymTimeWebAplication.BillingPage;


public class AddMemberTest {

	WebDriver driver=null;

	@BeforeTest
	public void testSetUp() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@Test
	public void login() throws Throwable {

		driver.get("http://103.156.21.183:8069/Frm_Login.aspx");

		LoginGymTime.usn_Textbox(driver).sendKeys("Rtest");
		LoginGymTime.usn_Textbox(driver).sendKeys(Keys.TAB);

		Thread.sleep(1000);
		LoginGymTime.pwd_Textbox(driver).sendKeys("Rtest");
		LoginGymTime.pwd_Textbox(driver).sendKeys(Keys.TAB);

		LoginGymTime.otp_Textbox(driver).sendKeys("1124");
		LoginGymTime.otp_Textbox(driver).sendKeys(Keys.TAB);

		LoginGymTime.login_Button(driver).click();

		LoginGymTime.checkIn(driver).click();
		
		AddMemberPage.member_Link(driver).click();
		
		AddMemberPage.registrationDate(driver).sendKeys(Keys.TAB);
		
		AddMemberPage.name_Textbox(driver).sendKeys("Deepali E");
		
		AddMemberPage.contact_Textbox(driver).sendKeys("1540012307");
		
		Thread.sleep(1000);
		AddMemberPage.whatsappNo_Textbox(driver).sendKeys("1540012345");
		
		Thread.sleep(1000);
		WebElement gen = AddMemberPage.gender_Dropdown(driver);
		gen.click();
		Select selectGender = new Select(gen);
		selectGender.selectByVisibleText("Male");
		
		AddMemberPage.email_Textbox(driver).sendKeys("rathod000@gmail.com");
		
		AddMemberPage.address_Textbox(driver).sendKeys("Cross No- 1");
		
		AddMemberPage.emergencyContact_Textbox(driver).sendKeys("6666655555");
		
		AddMemberPage.dob_Textbox(driver).sendKeys(Keys.TAB);
		
		WebElement bd = AddMemberPage.bloodGroup_Dropdown(driver);
		bd.click();
		Select selectbdGroup=new Select(bd);
		selectbdGroup.selectByVisibleText("B+");
		
		WebElement occ = AddMemberPage.Occupation_Dropdown(driver);
		occ.click();
		Select selectOcc = new Select(occ);
		selectOcc.selectByVisibleText("Job");
		
		AddMemberPage.gst_Textbox(driver).sendKeys("15fgg1251fd3fd4");
		
		AddMemberPage.next_Button(driver).click();
//--------------------------------------------------------------------------------------------------
		
		WebElement type = BillingPage.pkjType_Dropdown(driver);
		type.click();
		Select selectPackageType = new Select(type);
		selectPackageType.selectByVisibleText("Gym");
		
		Thread.sleep(2000);
		WebElement pName = BillingPage.pkjName_Dropdown(driver);
		pName.click();
		Select selectPackageName= new Select(pName);
		selectPackageName.selectByVisibleText("Gym Life");
		
		Thread.sleep(1000);
		WebElement inst = BillingPage.instructor_Dropdown(driver);
		inst.click();
		Select selectInstructor=new Select(inst);
		selectInstructor.selectByVisibleText("Lucky");
		
		WebElement t = BillingPage.time_Dropdown(driver);
		t.click();
		Select selectTime=new Select(t);
		selectTime.selectByVisibleText("5:00-6:00 AM");
		t.sendKeys(Keys.TAB);
		
		BillingPage.discount_Textbox(driver).sendKeys("0");
		
		
		
		
		
		
        }
	
	
	/*
	public void addMember() {
		
		AddMemberPage.member_Link(driver).click();
		
		AddMemberPage.registrationDate(driver).sendKeys(Keys.TAB);
		
		
	
		
	}   
	
	@AfterTest
	public void after() throws Throwable {
		
		Thread.sleep(2000);
		driver.quit();
	}
	*/
	

}

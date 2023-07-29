package testsOnGymTimeWebApplication;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesOfGymTimeWebAplication.ViewEnquiryPage;
import pagesOfGymTimeWebAplication.LoginGymTime;

public class ViewEnquiryTest {

	static WebDriver driver=null;


	@BeforeTest
	public void setUp()  {
		

		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void login()throws Throwable{
		driver.get("http://103.156.21.183:8069/Frm_Login.aspx");

		LoginGymTime.usn_Textbox(driver).sendKeys("Rtest");
		LoginGymTime.usn_Textbox(driver).sendKeys(Keys.TAB);

		Thread.sleep(1000);
		LoginGymTime.pwd_Textbox(driver).sendKeys("Rtest");
		LoginGymTime.pwd_Textbox(driver).sendKeys(Keys.TAB);

		Thread.sleep(1000);
		LoginGymTime.otp_Textbox(driver).sendKeys("1124");
		LoginGymTime.otp_Textbox(driver).sendKeys(Keys.TAB);

		Thread.sleep(1000);
		LoginGymTime.login_Button(driver).click();
		Thread.sleep(1000);
		LoginGymTime.checkIn(driver).click();
		Thread.sleep(1000);
		ViewEnquiryPage.enquiryEye_Button(driver).click();


		WebElement gender = ViewEnquiryPage.gender_Dropdown(driver);
		gender.click();
		Select selectGender = new Select(gender);
		selectGender.selectByVisibleText("Male");

		ViewEnquiryPage.search_Button(driver).click();
		Thread.sleep(2000);
	}
	@AfterTest
	public void offBrowser() throws Throwable {
		Thread.sleep(4000);
		driver.quit();
	}

}

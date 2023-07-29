import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TryScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver	driver=new ChromeDriver();
	
	//	WebDriver driver=new EdgeDriver();
		 
	//	WebDriver driver= new InternetExplorerDriver();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();

	driver.get("http://103.156.21.183:8069/");

	String gt = driver.getTitle();
	System.out.println(gt);
	
	WebElement usn = driver.findElement(By.name("txtUserName"));
	usn.sendKeys("Rtest");
	usn.sendKeys(Keys.TAB);
	Thread.sleep(2000);

	WebElement pwd = driver.findElement(By.name("txtPassword"));
	pwd.sendKeys("Rtest");
	pwd.sendKeys(Keys.TAB);

	WebElement otp = driver.findElement(By.name("txtOtp"));
	otp.sendKeys("1124");
	otp.sendKeys(Keys.ENTER);

	Thread.sleep(1000);
	WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
	loginButton.click();

//------------------------------------------------------------------------------------------------------------------
	String gt2 = driver.getTitle();
	System.out.println(gt2);
	
	// Check In 
	WebElement checkIn = driver.findElement(By.id("homeID"));
	checkIn.click();

//------------------------------------------------------------------------------------------------------------------	
	// click on add enquiry
	WebElement addEnquiry = driver.findElement(By.xpath("//a[@href='Frm_AddEnquiry.aspx']"));
	addEnquiry.click();

		String gt3 = driver.getTitle();
		System.out.println(gt3);
	}

}

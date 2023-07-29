import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);

	WebDriver	driver=new InternetExplorerDriver(); 
		driver.navigate().to("https://www.facebook.com/login/");
		
		driver.findElement(By.name("email")).sendKeys("dgdgtffghg");
		driver.findElement(By.name("pass")).sendKeys("dgfghjhghkjh");
		driver.findElement(By.name("login")).click();
		
		
		
		
	}

}

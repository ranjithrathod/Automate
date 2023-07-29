
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		 googleSearch();
		 
	}
	
	public static void googleSearch() {
		
		WebDriver	driver=new FirefoxDriver();
		driver.get("https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver");
	}

}

package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/Ranjith%20report%20%2025-05-23/htmlExample.html");
		
		 List<WebElement> r1 = driver.findElements(By.xpath("//input")); 
		
		 int a = r1.size();
	        System.out.println(a);  
	        for(int i=1;i<=a;i++)  
	        {  
	            r1.get(5).click();  
	        //	String any = r1.get(1).getText();
	        	
	        //	System.out.println(any);
	        	
	        }  
			
		}
		
		
	}


package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import tests.Demo_TestNG2;

public class PorpertiesFile {
	
	static Properties prop = new Properties();
	
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
           getProperties();
           setProperties();    
	}
	
	public static void getProperties()  {
		
		try {
		
	//	System.out.println(projectPath);
		InputStream input=new FileInputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
	    Demo_TestNG2.browserName=browser;
		}
		catch(Exception exp) {
			System.out.println("in catch block"+exp.getMessage());
			System.out.println("Nice"+exp.getCause());
			exp.getStackTrace();
		}     
		
	/*	Properties prop = new Properties();
		String projectPath = System.getProperty("user.dir");
	//	System.out.println(projectPath);
		InputStream input=new FileInputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);    */
		
	}
	
	// step-1 : Create a Object of class Properties class to set data (at globally)
	public static void setProperties()  {
		
		try {
			//step-2: Create a object of class OutputStream
		OutputStream output= new FileOutputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
		//step-3: set value
		prop.setProperty("result", "Nice");
		// step-4: Store values in properties file
		prop.store(output,null);
		}
		catch(Exception exp) {
			System.out.println("in catch block"+exp.getMessage());
			System.out.println("Nice"+exp.getCause());
			exp.getStackTrace();
		}
		
		
		
	}
	

}

package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	static Logger logg = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n Hello World...!  \n");
		
		//Info(Sting Message)
		logg.info("This a Information message");
		logg.error("This is error msg ");
		
		
		
	}

}

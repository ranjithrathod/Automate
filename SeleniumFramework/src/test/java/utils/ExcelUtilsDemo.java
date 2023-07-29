package utils;

import java.io.IOException;

public class ExcelUtilsDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String propath = System.getProperty("user.dir");
		ExcelUtils excel=new ExcelUtils(propath+"\\excel\\data.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(1, 0);
		excel.getCellDataNumber(1, 1);
	}

}

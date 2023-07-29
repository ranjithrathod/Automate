package utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	public static void main(String[] args) throws IOException {
		
		
	   String excelPath = "C:\\Users\\admin\\Desktop\\AutomationWorkspace\\SeleniumFramework\\excel\\data.xlsx";
		testData(excelPath, "Sheet1");
	}
	
	@DataProvider(name="test1data ")
	public static void getData() {
		
		
	}
	
	
	
	public static Object[][]  testData(String excelPath, String sheetName) {
		
		
		ExcelUtils002 excel=new ExcelUtils002(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColumnCount();
		
		Object data[][]=new Object[rowCount-1][colCount];		
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData+" | ");
				data[i-1][j]=cellData;
			}
			System.out.println();
		}
		return data;
		
	
	}

}

package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	// Globally variable for both methods
	static String propath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	// Constructor with same as class name
	public ExcelUtils(String excelPath, String sheetName) throws IOException  {
		
		workbook= new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
	}
	
	

	public static void main(String[] args)   {
	//	ExcelUtils.getRowCount();
	//	System.out.println("Functions Scripts");
	//	getCellDataString(1,2);
	//	getCellDataNumber(6,1);
	}        
	
	// For Get Row Count
	public static int getRowCount() throws IOException{

		int rowCount=0;
			 rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Total row count is: "+rowCount);
			return rowCount;
	}
	
	public static int getColumnCount() throws IOException {

		int colCount=0;
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total row count is: "+colCount);
		return colCount;
}

	//Get Cell Date of String Input
	public static String getCellDataString(int rowNum, int colNum) throws IOException {
		String cellData=null;
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("Cell data is : "+cellData);
			return cellData;
	}

	//Get Cell Date of Number Input
	public static void getCellDataNumber(int rowNum, int colNum) throws IOException {
 
		 double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("Cell data in number is: "+cellData);
	}






}

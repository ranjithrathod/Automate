package testOnGymTime;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GymTimeUtils {

	
	// Globally variable for both methods
	
		static XSSFWorkbook workbook;
		static XSSFSheet sheet;
		
		// Constructor with same as class name
		public GymTimeUtils(String excelPath, String sheetName)   {
			try {
			workbook= new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			}
			catch(Exception exp){
				exp.printStackTrace();
			}
		}
		
		
/*
		public static void main(String[] args)   {
			ExcelUtils.getRowCount();
			System.out.println("Functions Scripts");
			getCellDataString(1,2);
			getCellDataNumber(6,1);
		}       */   
		
		// For Get Row Count
		public static int getRowCount() {

			int rowCount=0;
			try {
				 rowCount = sheet.getPhysicalNumberOfRows();
				System.out.println("Total row count is: "+rowCount);
			}
			catch(Exception exp){
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();;
			}
				return rowCount;
		}
		
		public static int getColumnCount() {

			int colCount=0;
			try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total column count is: "+colCount);
			}
			catch(Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return colCount;
	}

		//Get Cell Date of String Input
		public static String getCellDataString(int rowNum, int colNum)  {
			String cellData=null;
			try {
				cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//	System.out.println("Cell data is : "+cellData);
			}
			catch(Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			
				return cellData;
		}

		//Get Cell Date of Number Input
		/*
		public static double getCellDataNumber(int rowNum, int colNum)  {
	           
			double cellData=0;
			try {
			  cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//	System.out.println("Cell data in number is: "+cellData);
				}
			catch(Exception exp){
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return cellData;
		}    */



	
}

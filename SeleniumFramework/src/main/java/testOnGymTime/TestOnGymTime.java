package testOnGymTime;

import java.io.IOException;

public class TestOnGymTime {

	public static void main(String[] args) throws IOException {


		String excelPath = "C:\\Users\\admin\\Desktop\\AutomationWorkspace\\SeleniumFramework\\excel\\testData.xlsx";
		testData(excelPath, "Sheet1");
	}

	public static Object[][] testData(String excelPath, String sheetName) {

		GymTimeUtils excel = new GymTimeUtils(excelPath, sheetName);

		int rowCount=GymTimeUtils.getRowCount();
		int colCount=GymTimeUtils.getColumnCount();

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

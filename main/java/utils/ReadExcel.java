package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String sheetName) throws IOException {
		
		//Locate the workbook 
		XSSFWorkbook wb = new XSSFWorkbook("./data/Lead.xlsx");
		
		//Locate the sheet in the workbook
		XSSFSheet ws = wb.getSheet(sheetName);
		
		//Getting last Row number
		int lastRow = ws.getLastRowNum();
				
		//Getting total columns
		int lastCell = ws.getRow(0).getLastCellNum();
		
		String[][] data = new String[lastRow][lastCell];
		
		//Reading all the rows and Columns
		for (int i = 1; i <= lastRow; i++) {
			for (int j=0;j< lastCell; j++) {
									
		String value =ws.getRow(i).getCell(j).getStringCellValue();
		data[i-1][j]=value;
			}
			
		}
		//Close the Excel
				wb.close();
				return data;
	}
	


}

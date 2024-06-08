package Base_Package;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Utility_Class {
	private static FileInputStream file;
	private static Sheet sheet;
	public static String Api_File ="C:\\Users\\user\\Desktop\\HRMS-2.0 Data file updated.xlsx";
   
	

	
    public static void Sheet_Name(String sheetName)throws IOException {
    	file = new FileInputStream(Api_File);
    	 sheet= WorkbookFactory.create(file).getSheet(sheetName);
    	 }
    public static String getCellData(int rowNumber, int columnNumber) {
        Row row = sheet.getRow(rowNumber -1);
        Cell cell = row.getCell(columnNumber -1);
        String String_cellValue = cell.getStringCellValue();
        return String_cellValue;
    
    }
   }


package Base_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Random_data_From_Excel {
	 public static String data;
	 public static final String userdir = System.getProperty("user.dir");
	
	public static void main(String Sheet_Name,int colNum,int minRowNum,int maxRowNum) throws IOException {
		String filePath = "C:\\Users\\user\\Desktop\\HRMS-2.0 Data file updated.xlsx"; // path to your Excel file
		
	//	String filePath = userdir+"\\Required Files\\HRMS-2.0 Data file.xlsx"; // path to your Excel file
		// int minRowNum = 1; // minimum row number to consider (excluding header)
		// int maxRowNum = 9; // maximum row number to consider
		//int colNum = 0; // column number to read data from
		
		Random random = new Random();
		 int rowNum = random.nextInt(maxRowNum - minRowNum + 1) + minRowNum;
		FileInputStream inputStream = new FileInputStream(new File(filePath));
		Workbook workbook = WorkbookFactory.create(inputStream);
		Sheet sheet = workbook.getSheet(Sheet_Name);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		data = cell.getStringCellValue();
// System.out.println("Random data from Excel: " + data);
		 workbook.close();
		 inputStream.close();
		 
	 }

	
	}


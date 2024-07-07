package Base_Package;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
 
public class Utility_Class {
	
	public static  String userdir = System.getProperty("user.dir");
	private static FileInputStream file;
	public static Sheet sheet;
	public static String Actual_Message;
	
//	static WebDriver driver = Base_Class.getDriver();
//=================================[ To fetch Excel File Data ] ============================
	
    public static void Set_File_Path(String SheetName)throws IOException {
    	file = new FileInputStream(userdir+"\\Required_Files\\Psyhire_Credentials.xlsx");
    	sheet= WorkbookFactory.create(file).getSheet(SheetName);}
    
    public static String getCellData(int rowNumber, int columnNumber) throws IOException {
    	Set_File_Path("Credentials ");
        Row row = sheet.getRow(rowNumber -1);
        Cell cell = row.getCell(columnNumber -1);
        String cellValue = cell.getStringCellValue();
        return cellValue;}
    
   
    public static void Excel_File_Path(String SheetName)throws IOException {
    	file = new FileInputStream(userdir+"\\Required_Files\\Agency_Data.xlsx");
    	sheet= WorkbookFactory.create(file).getSheet(SheetName);}
    
    public static String CellData(String name_of_sheet,int rowNumber, int columnNumber) throws IOException {
    	Excel_File_Path(name_of_sheet);
        Row row = sheet.getRow(rowNumber -1);
        Cell cell = row.getCell(columnNumber -1);
        String cellValue = cell.getStringCellValue();
        return cellValue;}
    
    
//===================================[ To Upload External Files ]================================================

    public static void Upload_File(String path_Of_File) throws AWTException, InterruptedException {
    	Robot rb=new Robot();
    	StringSelection Profile = new StringSelection(path_Of_File);
    	rb.delay(1000);
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Profile,null);		
    	rb.keyPress(KeyEvent.VK_CONTROL);
    	rb.keyPress(KeyEvent.VK_V);		
    	rb.keyRelease(KeyEvent.VK_CONTROL);
    	rb.keyRelease(KeyEvent.VK_V);		
    	rb.keyPress(KeyEvent.VK_ENTER);
    	rb.keyRelease(KeyEvent.VK_ENTER);
    }
    
    
//===================================[ Screenshot to extent report ]===============================================
    
    	public static String Capture_Screenshot() {
    		WebDriver driver = Base_Class.getDriver();
		String Base64Code= ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);	
		return "data:image/jpg;base64, " +Base64Code ;
		}	

 //===================================[ Toast Message Validation ]=================================================
    	
    	public static void Toast_Message_Validation (String Expected_Message) throws Exception  {
    		WebDriver driver = Base_Class.getDriver();
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Toastify']")));
    		Actual_Message = element.getText();
    	 	if (!Actual_Message.equalsIgnoreCase(Expected_Message)){
                throw new Exception();
            }
    		
    	}
    	
}
    	    
    	
		
    	
    	
    	


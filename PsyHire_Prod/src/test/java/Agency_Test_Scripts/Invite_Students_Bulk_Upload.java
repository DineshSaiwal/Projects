package Agency_Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Agency_Scenarios.Invite_Students_Bulk_Upload_Page;
import Base_Package.Base_Class;
import Base_Package.Login;
import Base_Package.ScreenRecorderUtil;
import Base_Package.Utility_Class;

public class Invite_Students_Bulk_Upload extends Base_Class {

	ExtentTest test;
		@Test 
		void Invite_Students_Validation() throws Exception{
			
			
			test = extent.createTest("Invite_Students_Bulk_Upload").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Agency");
			test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
			ScreenRecorderUtil.startRecord("Invite_Students_Bulk_Upload");
			test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
			WebDriver driver = getDriver();
			Invite_Students_Bulk_Upload_Page page= new Invite_Students_Bulk_Upload_Page(driver);	
			Login.Agency_Login();
			
				
 		 try {page.Click_on_Jobs_Tab();
		 	test.pass(MarkupHelper.createLabel("Clicked on Jobs tab", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Jobs tab",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 		 
		 	Thread.sleep(1000);
		 try {page.Click_on_Invite_Student();
		 	test.pass(MarkupHelper.createLabel("Clicked on Invite Student", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Invite Student",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 	
		 		Thread.sleep(1000);
			try {page.Select_Bulk_Upload();
				 	test.pass(MarkupHelper.createLabel("Clicked on Bulk Upload", ExtentColor.GREEN));} 
			catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Bulk Upload",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
						}
			
			Thread.sleep(1000);
			 try {page.Upload_Excel_File();
			 	test.pass(MarkupHelper.createLabel("Selected Excel File", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Select Excel File",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
		 		
			 Thread.sleep(1000);
			 try {page.Click_On_Upload_Button();
			 	test.pass(MarkupHelper.createLabel("Clicked on Upload Button", ExtentColor.GREEN));Thread.sleep(2000);
			 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); } 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Upload Button",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
		
			 
			 
			ScreenRecorderUtil.stopRecord();
			test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));

	
}}

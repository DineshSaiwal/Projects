package Institution_Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Institution_Scenarios.Invite_Students_Bulk_Upload_Page;
import Base_Package.*;

public class Invite_Students_Bulk_Upload extends Base_Class {

	ExtentTest test;
	public String Messages;
		@Test 
		void Invite_Students_Validation() throws Exception{
			
			
			test = extent.createTest("Invite_Students_Bulk_Upload").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Institution");
			test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
			test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
			ScreenRecorderUtil.startRecord("Invite_Students_Validation");
			WebDriver driver = getDriver();
			Invite_Students_Bulk_Upload_Page page= new Invite_Students_Bulk_Upload_Page(driver);	
			Login.Institution_Login();
			
				
					Thread.sleep(1000);
				 try {page.Click_on_Department();
				 	test.pass(MarkupHelper.createLabel("Clicked on Department tab", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Click on Department tab",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 
				 Thread.sleep(1000);
				 try {page.Click_on_Department_Card();
				 	test.pass(MarkupHelper.createLabel("Clicked on Existing Department Card", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Click on Department",  ExtentColor.RED));
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
					 	test.pass(MarkupHelper.createLabel("Clicked on Upload Button", ExtentColor.GREEN));} 
					 catch (Exception e) {
						test.fail(MarkupHelper.createLabel("Failed to Click on Upload Button",  ExtentColor.RED));
						test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
						test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
						ScreenRecorderUtil.stopRecord();
							}
					 
					 Thread.sleep(1000);
					 try {Utility_Class.Toast_Message_Validation("Invitation sent successfully");
					 	test.pass(MarkupHelper.createLabel("Invite sent to candidates successfully", ExtentColor.GREEN)); 
					 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); }
					 catch (Exception e) {
						test.fail(MarkupHelper.createLabel("Failed to Send Invitation", ExtentColor.RED));
						test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
						test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
						ScreenRecorderUtil.stopRecord(); }
					 
					 
									
					ScreenRecorderUtil.stopRecord();
					test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));

					
	
	
}}

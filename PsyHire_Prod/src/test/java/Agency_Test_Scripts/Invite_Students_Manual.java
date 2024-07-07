package Agency_Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Agency_Scenarios.Invite_Students_Manual_page;
import Base_Package.Base_Class;
import Base_Package.Login;
import Base_Package.ScreenRecorderUtil;
import Base_Package.Utility_Class;


public class Invite_Students_Manual extends Base_Class{
ExtentTest test;
	@Test 
	void Invite_Students_Validation() throws Exception{
		
		
		test = extent.createTest("Invite_Students_Manually").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Agency");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
		ScreenRecorderUtil.startRecord("Invite_Students_Validation");
		WebDriver driver = getDriver();
		Invite_Students_Manual_page page= new Invite_Students_Manual_page(driver);	
		Login.Agency_Login();
		
			
		Thread.sleep(1000);
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
			 try {page.Click_on_Enter_Manually();
			 	test.pass(MarkupHelper.createLabel("Selected Enter Manually option", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Select Enter Manually option",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Enter_Mails();
			 	test.pass(MarkupHelper.createLabel("Entered Students Mails", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Students Mails",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
		 			 
			 Thread.sleep(1000);
			 try {page.Click_on_Send_Button();
			 	test.pass(MarkupHelper.createLabel("Clicked on Send Button", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Send Button",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {Utility_Class.Toast_Message_Validation("Invitation sent successfully");
			 	test.pass(MarkupHelper.createLabel("Invite Sent To Candidates Successfully", ExtentColor.GREEN));
			 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot());  } 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Send Invitation", ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
				ScreenRecorderUtil.stopRecord(); }
			 
			 
			
			 ScreenRecorderUtil.stopRecord();
			 test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));
			 
			 
			 
			 
}
}
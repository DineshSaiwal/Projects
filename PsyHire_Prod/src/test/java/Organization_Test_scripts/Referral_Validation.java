package Organization_Test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Base_Class;
import Base_Package.Login;
import Base_Package.ScreenRecorderUtil;
import Base_Package.Utility_Class;
import Oragnization_Scenarios.Referral_Page;

public class Referral_Validation extends Base_Class{

	ExtentTest test;
	
		@Test 
		void Referral_validation() throws Exception{
			
			
			test = extent.createTest("Agency_Referral_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Organization");
			test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
			ScreenRecorderUtil.startRecord("Referral_Validation");
			test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
			WebDriver driver = getDriver();
			Referral_Page page= new Referral_Page(driver);	
			Login.Organization_Login();
			
				
					Thread.sleep(1000);
				 try {page.Click_on_Settings();
				 	test.pass(MarkupHelper.createLabel("Click On Settings", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Click on Settings",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
	
				 Thread.sleep(1000);
				 try {page.Click_On_Referral_Wallet();
				 	test.pass(MarkupHelper.createLabel("Clicked on Referral Wallet", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Click on Referral Wallet",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 
				 Thread.sleep(1000);
				 try {page.Enter_Client_Name();
				 	test.pass(MarkupHelper.createLabel("Entered Client_Name", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Enter Client_Name",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 
 				 try {page.Enter_Client_Email();
				 	test.pass(MarkupHelper.createLabel("Entered Client_Email", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Enter Client_Email",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 
				 Thread.sleep(1000);
				 try {page.Click_On_Share();
				 	test.pass(MarkupHelper.createLabel("Clicked on Share Button", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Click Share Button",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 
				
				 Thread.sleep(2000);
				 try {Utility_Class.Toast_Message_Validation("Referral details have been successfully emailed to the client.");
				 	test.pass(MarkupHelper.createLabel("Referral details have been successfully emailed to the client.", ExtentColor.GREEN));
				 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot());  } 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to send referral", ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
					ScreenRecorderUtil.stopRecord();
				 }
				 
				 				 
				ScreenRecorderUtil.stopRecord();
				test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));

				 
				 
			
				 
				 
				 
				 
				 
				 
				 
	
}}

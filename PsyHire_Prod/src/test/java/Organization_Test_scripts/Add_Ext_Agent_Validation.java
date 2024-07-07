package Organization_Test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Oragnization_Scenarios.Add_Ext_Agent_Page;
import Base_Package.Base_Class;
import Base_Package.Login;
import Base_Package.ScreenRecorderUtil;
import Base_Package.Utility_Class;

public class Add_Ext_Agent_Validation extends Base_Class {
ExtentTest test;
String Actual_Message;
	
	@Test 
	void Add_Ext_Agent_validation() throws Exception{
	
		test = extent.createTest("Add_Ext_Agent_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Organization");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		ScreenRecorderUtil.startRecord("Add_Ext_Agent_Validation");
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
		WebDriver driver = getDriver();
		Add_Ext_Agent_Page page= new Add_Ext_Agent_Page(driver);	
		Login.Organization_Login();
		
		Thread.sleep(1000);
		 try {page.Click_On_Settings();
		 	test.pass(MarkupHelper.createLabel("Clicked on Settings", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Settings",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Ext_Agent_Tab();
		 	test.pass(MarkupHelper.createLabel("Clicked on External Agent Tab", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on External Agent Tab",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Add_Agent();
		 	test.pass(MarkupHelper.createLabel("Clicked on Add Agent Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on  Add Agent Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Upload_Profile();
		 	test.pass(MarkupHelper.createLabel("Profile Picture Uploaded", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Upload Profile Picture",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Enter_Name();
		 	test.pass(MarkupHelper.createLabel("Entered Name", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Enter name",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 
 		 try {page.Enter_Email();
		 	test.pass(MarkupHelper.createLabel("Entered Email", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Enter Email",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
 		 try {page.Click_on_Contry_Code();
		 	test.pass(MarkupHelper.createLabel("Searching County Code", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Search Country code",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
 		 try {page.Enter_Country_Code();
		 	test.pass(MarkupHelper.createLabel("Selected Country Code", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select Country Code",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
 		 try {page.Enter_Telephone_Number();
		 	test.pass(MarkupHelper.createLabel("Entered Telephone Number", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Enter Telephone Number",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}	 
		 
 		 try {page.Click_On_Add();
		 	test.pass(MarkupHelper.createLabel("Clicked on Add Button", ExtentColor.GREEN));
		 	Thread.sleep(2000);
		 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); } 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click Add Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}

		 
// 		 Thread.sleep(2000);
//		 try {Utility_Class.Toast_Message_Validation("External Agent added External Agent is added to your team in a few seconds");
//		 	test.pass(MarkupHelper.createLabel("External Agent Added Successfully", ExtentColor.GREEN));
//		 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot());  } 
//		 catch (Exception e) {
//			test.fail(MarkupHelper.createLabel("Failed to add External Agent", ExtentColor.RED));
//			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
//			test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
//			ScreenRecorderUtil.stopRecord();
//		 	}
		
		
		ScreenRecorderUtil.stopRecord();
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));

		 
	 
	}
}

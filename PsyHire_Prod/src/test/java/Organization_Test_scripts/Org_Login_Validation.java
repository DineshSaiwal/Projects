package Organization_Test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Base_Class;
import Base_Package.ScreenRecorderUtil;
import Base_Package.Utility_Class;
import Oragnization_Scenarios.Organization_Login_Page;

public class Org_Login_Validation extends Base_Class {
	ExtentTest test;
	
	@Test 
	void PsyHire_Organization_Login() throws Exception{
		test = extent.createTest("PsyHire_Organization_Login").assignDevice(browserName).assignCategory("Organization").assignAuthor("Dinesh_Saiwal");
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		ScreenRecorderUtil.startRecord("PsyHire_Organization_Login");
		WebDriver driver = getDriver();
		Organization_Login_Page page= new Organization_Login_Page(driver);	
	 
			Thread.sleep(1000);
			 try {page.setUserName();
			 	test.pass(MarkupHelper.createLabel("Username Entered Successfully", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Username",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			
			 Thread.sleep(1000);
			 try {page.setpassword();
			 	test.pass(MarkupHelper.createLabel("Password Entered Successfully", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Password",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);	
			 try {page.Click_on_Signin();
			 	test.pass(MarkupHelper.createLabel("Clicked on Signin", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Signin",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Accept_popup();
			 	test.info(MarkupHelper.createLabel("Active Session popup found", ExtentColor.BLUE));} 
			 catch (Exception e) {
				test.info(MarkupHelper.createLabel("No Active Session popup found",  ExtentColor.BLUE));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);	
			 try {page.Plan_Popup();
			 	test.info(MarkupHelper.createLabel("Subscription Popup Found", ExtentColor.BLUE)); } 
			 catch (Exception e) {
				test.info(MarkupHelper.createLabel("No Subscription Popup Found",  ExtentColor.BLUE));
				ScreenRecorderUtil.stopRecord();
					}
	
			 Thread.sleep(1000);	
			 String actualTitle = driver.getCurrentUrl();
			 String expectedTitle = "https://app.psyhire.ai/united_spirits/dashboard";
			 if (actualTitle.equals(expectedTitle)) {
				 test.pass(MarkupHelper.createLabel("Navigated To Dashboard Successfully", ExtentColor.GREEN));
				 test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); } 
			 else {test.fail(MarkupHelper.createLabel("Failed to Navigate To Dashboard", ExtentColor.RED));	
		         test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot());
		        }
			 
			 
			 	ScreenRecorderUtil.stopRecord();
			 	test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));
				 
				
	 		
	 
	
		
	
	
	}
	
	
}

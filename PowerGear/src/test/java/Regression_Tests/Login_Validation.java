package Regression_Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Base_Class;
import Base_Package.Utility_Class;
import Scenarios.Login_Page;

public class Login_Validation extends Base_Class{
	ExtentTest test;
	
	@Test
	void Login_Test() throws IOException, InterruptedException {
		
		test = extent.createTest("Login Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Regression Test");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		
		Login_Page page= new Login_Page(driver);
		

		 try {page.EnterMail();
		 	test.pass(MarkupHelper.createLabel("Entered Email Address", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Enter Email Address",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		
		 try {page.setPassword();
		 	test.pass(MarkupHelper.createLabel("Entered Password", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Enter Password",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		
		 try {page.ClickSignin();
		 	test.pass(MarkupHelper.createLabel("Clicked on Sign in Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click On Signnin Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		
		 try {page.Accept_Popup();
		 	test.pass(MarkupHelper.createLabel("Existing Session Popup Accepted", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("No Existing Session Popup Found",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		
	}
	
	
}

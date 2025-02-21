package Regression_Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Base_Package.Base_Class;
import Base_Package.PowerGear;
import Scenarios.Change_Password_Page;

public class Change_Password extends Base_Class{

	@Test
	void Change_Password_Validation() throws IOException, InterruptedException {
		
		
		Change_Password_Page page= new Change_Password_Page(driver);
		PowerGear.Login();
		Thread.sleep(2000);
		page.Click_Setting();
		page.Click_Profile();
		
		page.Click_ChangePassword();
		page.ChangePassowordPopup();

		
		
		
		
		
		
		
		
	}
	
	
}

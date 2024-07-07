package Base_Package;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import Agency_Scenarios.Agency_Login_Page;
import Institution_Scenarios.Institution_Login_Page;
import Oragnization_Scenarios.Organization_Login_Page;

public class Login{
	
	public static void Institution_Login () throws EncryptedDocumentException, IOException, InterruptedException{
		WebDriver driver = Base_Class.getDriver();
		Institution_Login_Page Obj=new Institution_Login_Page(driver);
		Thread.sleep(1000);
		Obj.setUserName();
		Obj.setpassword();
		Obj.Click_on_Signin();
	      Thread.sleep(2000);
		try {Obj.Accept_popup();Thread.sleep(2000);} 
		catch (Exception e) {}
		try {Obj.Plan_Popup();} 
		catch (Exception e) {}
	    
	}	
	
	public static void Agency_Login () throws EncryptedDocumentException, IOException, InterruptedException{
		WebDriver driver = Base_Class.getDriver();
		Agency_Login_Page Obj=new Agency_Login_Page(driver);
		Thread.sleep(1000);
		Obj.setUserName();
		Obj.setpassword();
		Obj.Click_on_Signin();
		 Thread.sleep(2000);
		try {Obj.Accept_popup();Thread.sleep(2000);} 
		catch (Exception e) {}
		try {Obj.Plan_Popup();} 
		catch (Exception e) {}
	}
	
	public static void Organization_Login () throws EncryptedDocumentException, IOException, InterruptedException{
		WebDriver driver = Base_Class.getDriver();
		Organization_Login_Page Obj=new Organization_Login_Page(driver);
		Thread.sleep(1000);
		Obj.setUserName();
		Obj.setpassword();
		Obj.Click_on_Signin();
		 Thread.sleep(2000);
		try {Obj.Accept_popup();Thread.sleep(2000);} 
		catch (Exception e) {}
		try {Obj.Plan_Popup();} 
		catch (Exception e) {}
	    
	}
}


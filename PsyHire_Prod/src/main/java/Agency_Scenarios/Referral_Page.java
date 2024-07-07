package Agency_Scenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Utility_Class;

public class Referral_Page extends Utility_Class{
	
	
		@FindBy(xpath = "//img[@alt='settings']")
		private WebElement click_on_setting;
		public void Click_on_Settings() 
		{click_on_setting.click();}
		
		
		@FindBy(xpath = "//p[text()='Referral Wallet']")
		private WebElement click_on_Referral_Wallet;
		public void Click_On_Referral_Wallet() 
		{click_on_Referral_Wallet.click();}
		
		
		@FindBy(name = "client_name")
		private WebElement Enter_Client_name;
		public void Enter_Client_Name() throws IOException 
		{Enter_Client_name.sendKeys(CellData("Referral", 1, 1));}
		
		
		@FindBy(name = "client_work_email")
		private WebElement Enter_client_work_email;
		public void Enter_Client_Email() throws IOException 
		{Enter_client_work_email.sendKeys(CellData("Referral", 2, 1));}
		
		

		@FindBy(xpath = "//span[text()='Share']")
		private WebElement Click_on_Share;
		public void Click_On_Share() 
		{Click_on_Share.click();}
		
		
		public  Referral_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
			} 
		
}

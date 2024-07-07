package Oragnization_Scenarios;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Utility_Class;
public class Add_Ext_Agent_Page extends Utility_Class{

	@FindBy(xpath = "//img[@alt='settings']")
	private WebElement Click_on_Settings;
	public void Click_On_Settings(){Click_on_Settings.click();	}
	
	
	@FindBy(xpath = "//p[contains(text(),'External agents')]")
	private WebElement Click_on_agents_tab;
	public void Click_On_Ext_Agent_Tab(){Click_on_agents_tab.click();}


	@FindBy(xpath = "//span[contains(text(),'Add external agent')]")
	private WebElement Click_on_AddExternalAgent;
	public void Click_On_Add_Agent(){Click_on_AddExternalAgent.click();	}
	
	
	@FindBy(xpath = "(//img[@alt='Profile'])[3]")
	private WebElement Upload_profile;
	public void Upload_Profile() throws AWTException, InterruptedException{
		Upload_profile.click();
		Utility_Class.Upload_File(Utility_Class.userdir+"\\Required_Files\\Profile_Picture.jpg");}
	
	
	@FindBy(xpath = "//input[@placeholder='Enter full name']")
	private WebElement EnterName;
	public void Enter_Name() throws IOException{EnterName.sendKeys(CellData("Team_Member",1,3));}

	@FindBy(xpath = "//input[@placeholder='Enter work email']")
	private WebElement EnterEmail;
	public void Enter_Email() throws IOException{EnterEmail.sendKeys(CellData("Team_Member",2,3));	}
	
	@FindBy(xpath = "(//input[@type='search'])[6]")
	private WebElement click_on_Contry_Code;
	public void Click_on_Contry_Code() throws IOException{click_on_Contry_Code.sendKeys(CellData("Team_Member",3,3));		}
	
	
	@FindBy(xpath = "//p[@class=' font-normal text-sm text-gray-primary']")
	private WebElement enter_country_code;
	public void Enter_Country_Code(){enter_country_code.click();}

	@FindBy(xpath = "(//input[@placeholder='Enter telephone number'])[4]")
	private WebElement enter_Telephone_Number;
	public void Enter_Telephone_Number() throws IOException{enter_Telephone_Number.sendKeys(CellData("Team_Member",4,3));}

	@FindBy(xpath="//span[text()='Add']")
	private WebElement Click_on_Add;
	public void Click_On_Add(){Click_on_Add.click();	}
	
	
	public  Add_Ext_Agent_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		} 
}

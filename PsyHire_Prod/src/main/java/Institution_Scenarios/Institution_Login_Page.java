package Institution_Scenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Utility_Class;
public class Institution_Login_Page {
	
	
			@FindBy(name = "email")
			private WebElement username;
			
			@FindBy(name = "password")
			private WebElement password;
			
			@FindBy(xpath = "//span[text()='Sign in']")
			private WebElement Sign_in;
			
			@FindBy(xpath = "//span[text()='Yes']")
			private WebElement popup;
			
			@FindBy(xpath = "//span[text()='Continue with free plan']")
			private WebElement Plan_popup;
			
			
			public  Institution_Login_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
			} 
			
			
			public void setUserName() throws IOException
			{username.sendKeys(Utility_Class.getCellData(1,1));
			}
			
			public void setpassword() throws IOException
			{password.sendKeys(Utility_Class.getCellData(1,2));
			}
			
			public void Click_on_Signin() 
			{Sign_in.click();
			}
			
			public void Accept_popup() 
			{popup.click();
			}
			
			public void Plan_Popup() 
			{Plan_popup.click();
			}
			
						
//			public void login(String un,String pw)
//			{
//					username.sendKeys(un);  
//			      password.sendKeys(pw);
//				  Sign_in.click();
//			}
			
			
			
	
}

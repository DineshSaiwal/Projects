package Scenarios;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Package.Base_Class;

public class Login_Page {

	@FindBy(name="email") 	private WebElement username;
	public void EnterMail() throws IOException
	{username.sendKeys("dineshsaiwal@starmail.net");
	}
	
	@FindBy(name="password") private WebElement password;
	public void setPassword() {
		password.sendKeys("Abcd.1234");
	}
	
	@FindBy(xpath="//span[contains(text(),'Sign in')]") private WebElement signIn;
	@FindBy(xpath="//span[contains(text(),'Yes')]") private WebElement yes;


	
	
	public void ClickSignin() throws IOException, InterruptedException {
         signIn.click();
         Thread.sleep(1000);
         try { WebElement error = Base_Class.driver.findElement(By.xpath("//p[text()='Incorrect password']"));
         	if (error.isDisplayed()) {
         		password.clear();
 	            password.sendKeys("Abcd.12345");
 	            signIn.click();Thread.sleep(1000);}
         	else {        }
      			} 
         catch (Exception e) {		}
         
	}
	
	public void Accept_Popup() {
	try {yes.click();} 
	catch (Exception e) {}
		}
	
	
	@FindBy(xpath = "//img[@alt='close']") private WebElement ToastClose;
	public void ToastClose() {ToastClose.click();
		
	}
	
	public  Login_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	} 
	
	
	
	
}

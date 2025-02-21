package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_Package.Base_Class;

public class Change_Password_Page {
	
	

	@FindBy(xpath="//div[contains (text(),'Dinesh Saiwal')]") 	private WebElement ClickSetting;
	public void Click_Setting() {
		ClickSetting.click();
	}
	
	@FindBy(xpath = "//span[text()='Profile']") private WebElement ClickProfile;
	public void Click_Profile() {
		ClickProfile.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Change Password')]") private WebElement ChangePassword;
	public void Click_ChangePassword() {
		ChangePassword.click();
	}
	
	@FindBy(name="old_password") private WebElement currentPassword;
//	public void EnterCurrentPassword() {
//		currentPassword.sendKeys("Abcd.1234");
//	}
	
	@FindBy(name="new_password") private WebElement newPassword;
//	public void NewPassword() {
//		newPassword.sendKeys("Abcd.1235");
//	}
	
	@FindBy(name="confirm_password") private WebElement confirmPassword;
//	public void ConfirmPassword() {
//		confirmPassword.sendKeys("Abcd.1235");
//	}
	
	@FindBy(xpath="//span[contains(text(),'Confirm')]") private WebElement confirm;
//	public void ClickSave() {
//		confirm.click();
//	}	
	
	
	public void ChangePassowordPopup() throws InterruptedException {
		
		currentPassword.sendKeys("Abcd.1234");Thread.sleep(1000);
		newPassword.sendKeys("Abcd.12345");Thread.sleep(1000);
		confirmPassword.sendKeys("Abcd.12345");Thread.sleep(1000);
		confirm.click();Thread.sleep(1000);
		
		try {
			String error = Base_Class.driver.findElement(By.xpath("//p[text()='Incorrect password']")).getText();
			if (error.equalsIgnoreCase("Old Password is Incorrect")) {
				currentPassword.clear();
				currentPassword.sendKeys("Abcd.12345");Thread.sleep(1000);
				newPassword.clear();
				newPassword.sendKeys("Abcd.1234");Thread.sleep(1000);
				confirmPassword.clear();
				confirmPassword.sendKeys("Abcd.1234");Thread.sleep(1000);
				confirm.click();
			}
		} catch (Exception e) {
		
		}
		
	}
	
	
	
	
	public  Change_Password_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	} 
}

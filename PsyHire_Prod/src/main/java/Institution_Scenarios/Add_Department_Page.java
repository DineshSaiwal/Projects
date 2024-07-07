package Institution_Scenarios;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Add_Department_Page {

	
			@FindBy(xpath = "//p[text()='Department']")
			private WebElement click_on_department;
			public void Click_on_Department() 
			{click_on_department.click();}
						
			
			@FindBy(xpath = "//span[text()='Add department']")
			private WebElement click_on_Add_department;
			public void click_on_Add_department() 
			{click_on_Add_department.click();}
			
			
			@FindBy(name = "title")
			private WebElement department_name;
			public void department_name() 
			{department_name.sendKeys("Department 01");}	
			
			
			@FindBy(xpath = "//input[@placeholder='Assign head']")
			private WebElement Click_on_dropdown;
			public void Click_on_Dropdown() 
			{Click_on_dropdown.click();}	
			
			
			@FindBy(xpath = "//div[@class='mantine-jlrfru mantine-Select-item']")
			private List<WebElement> HOD ;
			public void Select_HOD(String HOD_Name) {
				for (WebElement element : HOD) {
					String Hods=element.getText();
					 if (Hods.equals(HOD_Name)) {
						 element.click();}
					}
				}
			

			@FindBy(xpath = "(//span[text()='Add department'])[2]")
			private WebElement create_Department;
			public void Create_Department() 
			{create_Department.click();}	
			
			
			
			
			public  Add_Department_Page(WebDriver driver) {
				PageFactory.initElements(driver, this);
				} 
			
			
			
			
			
			
	
}

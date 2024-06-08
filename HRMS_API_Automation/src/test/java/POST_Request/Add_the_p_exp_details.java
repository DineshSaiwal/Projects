package POST_Request;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base_Package.Login;
import Base_Package.Path;
import Base_Package.Utility_Class;
import GET_Request.Get_all_the_employees;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Add_the_p_exp_details extends Login{
	static ExtentTest Message;
	@Test
	public static void add_the_p_exp_details() throws IOException {
		Message=extent.createTest("Add_the_p_exp_details").assignAuthor(AutherT).assignCategory(Post);
		Userlogin();
		Get_all_the_employees.get_all_the_employees();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.MULTIPART)				
				.formParam("employee_id", Get_all_the_employees.id)
				.formParam("organisation", "TEST001")
				.formParam("role", "QA")
				.formParam("from_date", "2020-07-17")
				.formParam("to_date", "2020-07-17")
				.multiPart("joining_letter", new File ("C:\\Users\\user\\API Automation\\HRMS_API_Automation\\Required Files\\Joining-Letter-Format.png"))			
				.multiPart("experience_letter", new File ("C:\\Users\\user\\API Automation\\HRMS_API_Automation\\Required Files\\Exp letter.png"))			
				.post(base_url+Path.Add_the_p_exp_details);	
			
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Add_the_p_exp_details", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Add_the_p_exp_details", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

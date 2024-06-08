package PUT_Request;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Login;
import Base_Package.Path;
import Base_Package.Random_data_From_Excel;
import GET_Request.Get_all_the_available_designations;
import GET_Request.Get_all_the_available_holiday_types;
import GET_Request.Get_all_the_employees;
import GET_Request.Get_all_the_skill_Development;
import GET_Request.Get_the_bank_details;
import GET_Request.Get_the_family_details;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_a_skill_Development extends Login{
	static ExtentTest Message;
	@Test
	public static void update_a_skill_Development() throws IOException {
		Message=extent.createTest("Update_a_skill_Development").assignAuthor(AutherT).assignCategory(Put);
		Userlogin();
		
		Get_all_the_skill_Development.get_all_the_skill_Development();		
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.URLENC)				
				.formParam("id", Get_all_the_skill_Development.id)
				.formParam("employee_id", Get_all_the_skill_Development.employee_id)
				.formParam("title", "Manual testing certificate from udamy")
				.put(base_url+Path.Update_a_skill_Development);
		
		JsonPath JP = response.jsonPath(); 
		System.out.println(response.getStatusLine());
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_a_skill_Development", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_a_skill_Development", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

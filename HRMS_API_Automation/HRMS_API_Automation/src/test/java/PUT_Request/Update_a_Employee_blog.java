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
import GET_Request.Get_all_the_blogs_of_the_emplyoee;
import GET_Request.Get_all_the_employees;
import GET_Request.Get_all_the_skill_Development;
import GET_Request.Get_the_bank_details;
import GET_Request.Get_the_family_details;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_a_Employee_blog extends Login{
	static ExtentTest Message;
	@Test
	public static void update_a_Employee_blog() throws IOException {
		Message=extent.createTest("Update_a_Employee_blog").assignAuthor(AutherT).assignCategory(Put);
		Userlogin();
		Random_data_From_Excel.main("PUT", 37, 1, 1);
		Get_all_the_blogs_of_the_emplyoee.get_all_the_blogs_of_the_emplyoee();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)				
				.body("{\"id\":\""+Get_all_the_blogs_of_the_emplyoee.id+"\","
						+Random_data_From_Excel.data+"}")
				.put(base_url+Path.Update_a_Employee_blog);
		
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_a_Employee_blog", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_a_Employee_blog", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

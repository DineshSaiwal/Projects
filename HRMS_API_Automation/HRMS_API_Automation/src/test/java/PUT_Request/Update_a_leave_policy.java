package PUT_Request;

import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Login;
import Base_Package.Path;
import GET_Request.Get_the_policies_of_the_company;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_a_leave_policy extends Login{
	static ExtentTest Message;
	@Test
	public static void update_a_leave_policy() throws IOException {
		Message=extent.createTest("Update_a_leave_policy").assignAuthor(AutherT).assignCategory(Put);
		login();
		Get_the_policies_of_the_company.get_the_policies_of_the_company();
		
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 				
				.formParam("id",Get_the_policies_of_the_company.id )
				.formParam("name", "ssss Policy")
				.formParam("is_applicable_for_all_emp", "True")
				.formParam("is_applicable_for_all_grade", "True")
				.formParam("is_applicable_for_all_salary", "False")
				.formParam("is_applicable_for_all_depart", "False")
				.contentType(ContentType.URLENC)
				.put(base_url+Path.Update_a_leave_policy);

		JsonPath JP = response.jsonPath(); 					
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_a_leave_policy", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_a_leave_policy", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

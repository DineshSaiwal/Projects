package PUT_Request;

import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Login;
import Base_Package.Path;
import GET_Request.Get_all_the_employees;
import GET_Request.Get_the_p_exp_details;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_the_p_exp_details extends Login{
	static ExtentTest Message;
	@Test
	public static void update_the_p_exp_details() throws IOException {
		Message=extent.createTest("Update_the_p_exp_details").assignAuthor(AutherT).assignCategory(Put);
		Userlogin();	
		Get_the_p_exp_details.get_the_p_exp_details();
		Get_all_the_employees.get_all_the_employees();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.URLENC)	
				.formParam("id",Get_the_p_exp_details.id )
				.formParam("employee_id", Get_all_the_employees.id)
				.formParam("organisation", "TEST005")
				.formParam("role", "Frontend Developer")
				.formParam("from_date", "2015-07-17")
				.formParam("to_date", "2020-07-17")
				.put(base_url+Path.Update_the_p_exp_details);
		System.out.println(response.getStatusLine());
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_the_p_exp_details", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_the_p_exp_details", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

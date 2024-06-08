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
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_an_employees_salary_info extends Login{
	static ExtentTest Message;
	@Test
	public static void update_an_employees_salary_info() throws IOException {
		Message=extent.createTest("Update_an_employees_salary_info").assignAuthor(AutherT).assignCategory(Put);
		login();		
	
	Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.URLENC)
				.formParam("id",Get_all_the_employees.id)
				.put(base_url+Path.Update_an_employees_salary_info);
		
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_an_employees_salary_info", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_an_employees_salary_info", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

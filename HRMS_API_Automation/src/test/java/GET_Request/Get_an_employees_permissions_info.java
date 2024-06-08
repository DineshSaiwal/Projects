package GET_Request;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base_Package.Login;
import Base_Package.Path;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Get_an_employees_permissions_info extends Login{
	static ExtentTest Message;
	public static int id;
	
	@Test
	public static void get_an_employees_permissions_info() throws IOException {
		Message=extent.createTest("Get_an_employees_permissions_info").assignAuthor(AutherT).assignCategory(Get);
		login();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.param("employee_id", 138)
				.get(base_url+Path.Get_an_employees_permissions_info);
		
		JsonPath JP = response.jsonPath(); 
		//id=JP.get("data[0].id");
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Get_an_employees_permissions_info", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{Message.fail(MarkupHelper.createLabel("Get_an_employees_permissions_info", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

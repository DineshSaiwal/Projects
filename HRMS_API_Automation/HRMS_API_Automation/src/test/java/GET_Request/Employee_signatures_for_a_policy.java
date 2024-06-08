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

public class Employee_signatures_for_a_policy extends Login {
	static ExtentTest Message;
	public static int id;
	@Test
	public static void employee_signatures_for_a_policy() throws IOException {
		Message=extent.createTest("Employee_signatures_for_a_policy").assignAuthor(AutherT).assignCategory(Get);
		login();
		Get_the_policies_of_the_company.get_the_policies_of_the_company();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.param("policy_id",Get_the_policies_of_the_company.id )
				.get(base_url+Path.employee_signatures_for_a_policy);
		
		JsonPath JP = response.jsonPath();
		//id=JP.get("data[0].emp_data.id");
		System.out.println(response.getStatusLine());
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Employee_signatures_for_a_policy", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Employee_signatures_for_a_policy", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

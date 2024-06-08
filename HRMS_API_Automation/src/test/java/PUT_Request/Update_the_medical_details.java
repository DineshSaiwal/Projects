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
import GET_Request.Get_the_bank_details;
import GET_Request.Get_the_family_details;
import GET_Request.Get_the_medical_details;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_the_medical_details extends Login{
	static ExtentTest Message;
	@Test
	public static void update_the_medical_details() throws IOException {
		Message=extent.createTest("Update_the_medical_details").assignAuthor(AutherT).assignCategory(Put);
		Userlogin();
		Random_data_From_Excel.main("PUT", 32, 1, 5);
		Get_the_medical_details.get_the_medical_details();
		Get_all_the_employees.get_all_the_employees();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)
				.body("{\"id\":" + Get_the_medical_details.id 
						+ ",\"employee_id\":\"" + Get_all_the_employees.id 
						+ "\"," + Random_data_From_Excel.data + "}")
				.put(base_url+Path.Update_the_medical_details);
		
		JsonPath JP = response.jsonPath(); 
		System.out.println(response.getStatusLine());
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_the_medical_details", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_the_medical_details", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

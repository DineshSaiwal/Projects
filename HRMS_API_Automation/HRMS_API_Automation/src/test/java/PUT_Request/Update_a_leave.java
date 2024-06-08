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
import GET_Request.Get_all_the_available_leave_types;
import GET_Request.Get_all_the_employees;
import GET_Request.Get_the_bank_details;
import GET_Request.Get_the_leaves_for_the_employees;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_a_leave extends Login{
	static ExtentTest Message;
	@Test
	public static void update_a_leave() throws IOException {
		Message=extent.createTest("Update_a_leave").assignAuthor(AutherT).assignCategory(Put);
		login();
		Random_data_From_Excel.main("PUT", 34, 1, 1);
		Get_the_leaves_for_the_employees.get_the_leaves_for_the_employees();

		
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)
				.body("{\"id\":" + Get_the_leaves_for_the_employees.id 
						+ "," + Random_data_From_Excel.data + "}")

				.put(base_url+Path.Update_a_leave);
		
		JsonPath JP = response.jsonPath(); 
		System.out.println(response.getStatusLine());
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_a_leave", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_a_leave", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

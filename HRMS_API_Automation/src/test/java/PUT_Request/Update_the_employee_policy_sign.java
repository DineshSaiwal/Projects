package PUT_Request;

import java.io.IOException;

import org.apache.poi.sl.usermodel.ObjectMetaData.Application;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Login;
import Base_Package.Path;
import Base_Package.Random_data_From_Excel;
import GET_Request.Get_all_the_available_leave_types;
import GET_Request.Get_all_the_employees;
import GET_Request.Get_the_emergency_contact_details;
import GET_Request.Get_the_information_related_to_the_policies_of_the_employee;
import GET_Request.Get_the_p_exp_details;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_the_employee_policy_sign extends Login{
	static ExtentTest Message;
	@Test
	public static void update_the_employee_policy_sign() throws IOException {
		Message=extent.createTest("Update_the_employee_policy_sign").assignAuthor(AutherT).assignCategory(Put);
		Userlogin();		
		Get_the_information_related_to_the_policies_of_the_employee.get_the_information_related_to_the_policies_of_the_employee();	
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token)
				.contentType(ContentType.JSON)
				.body("{\"policy_id\":\"" + Get_the_information_related_to_the_policies_of_the_employee.id + "\"}")
				.put(base_url+Path.Update_the_employee_policy_sign);
	
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_the_employee_policy_sign", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_the_employee_policy_sign", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

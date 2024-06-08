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
import GET_Request.Get_the_p_exp_details;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_the_emergency_contact_details extends Login{
	static ExtentTest Message;
	@Test
	public static void update_the_emergency_contact_details() throws IOException {
		Message=extent.createTest("Update_the_emergency_contact_details").assignAuthor(AutherT).assignCategory(Put);
		Userlogin();	
		Random_data_From_Excel.main("PUT", 30, 1, 5);
		Get_the_emergency_contact_details.get_the_emergency_contact_details();
		Get_all_the_employees.get_all_the_employees();
	

		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token)
				.contentType(ContentType.JSON)
				.body("{\"id\":\"" + Get_the_emergency_contact_details.id + "\","
					    + "\"employee_id\":\"" + Get_all_the_employees.id + "\","
					    + Random_data_From_Excel.data + "}")
				.put(base_url+Path.Update_the_emergency_contact_details);
	
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_the_emergency_contact_details", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_the_emergency_contact_details", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

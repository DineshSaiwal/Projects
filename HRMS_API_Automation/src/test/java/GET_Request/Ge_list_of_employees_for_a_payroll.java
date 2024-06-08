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

public class Ge_list_of_employees_for_a_payroll extends Login{
	static ExtentTest Message;
	@Test
	public static void get_list_of_employees_for_a_payroll() throws IOException {
		Message=extent.createTest("Ge_list_of_employees_for_a_payroll").assignAuthor(AutherT).assignCategory(Get);
		login();
//		Get_all_the_payrolls.get_all_the_payrolls();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.param("payroll_id", Get_all_the_payrolls.id)
				.get(base_url+Path.Ge_list_of_employees_for_a_payroll);
		
		JsonPath JP = response.jsonPath(); 		
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Ge_list_of_employees_for_a_payroll", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Ge_list_of_employees_for_a_payroll", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

package POST_Request;

import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Login;
import Base_Package.Path;
import Base_Package.Utility_Class;
import GET_Request.Get_all_the_Leave_Modules;
import GET_Request.Get_all_the_payrolls;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Add_a_new_payroll extends Login{
	static ExtentTest Message;
//	@Test
//	public static void add_a_new_payroll() throws IOException {
//		Message=extent.createTest("Add_a_new_payroll").assignAuthor(AutherT).assignCategory(Post);
//		Utility_Class.Sheet_Name("POST");
//		login();
//		Response response = RestAssured.given()
//				.header("Authorization","jwt "+Token) 
//				.contentType(ContentType.JSON)
//				.body(Utility_Class.getCellData(2, 27))
//				.post(base_url+Path.Add_a_new_payroll);
//		
//		JsonPath JP = response.jsonPath(); 
//
//System.out.println(response.getStatusLine());
////Validation 
//		if(response.getStatusCode()==200) {
//			Message.pass(MarkupHelper.createLabel("Add_a_new_payroll", ExtentColor.GREEN));			
//			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
//			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
//			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
//		else{
//			Message.fail(MarkupHelper.createLabel("Add_a_new_payroll", ExtentColor.RED));
//			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
//			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
//			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
//	}
}

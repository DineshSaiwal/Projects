package POST_Request;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Login;
import Base_Package.Path;
import Base_Package.Utility_Class;
import GET_Request.Get_the_policies_of_the_company;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Add_a_new_policy_for_the_company extends Login{
	static ExtentTest Message;
	@Test
	public static void add_a_new_policy_for_the_company() throws IOException {
		Message=extent.createTest("Add_a_new_policy_for_the_company").assignAuthor(AutherT).assignCategory(Post);
		Utility_Class.Sheet_Name("POST");
		login();	
		Utility_Class.Sheet_Name("POST");
		Get_the_policies_of_the_company.get_the_policies_of_the_company();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 				
				.formParam("name",Utility_Class.getCellData(2,28) )
				.formParam("is_applicable_for_all_emp", "True")
				.formParam("is_applicable_for_all_grade", "True")
				.formParam("is_applicable_for_all_salary", "False")
				.formParam("is_applicable_for_all_depart", "True")
				.multiPart("policy_document", new File("C:\\Users\\user\\Downloads\\QA_001.pdf"))
				.contentType(ContentType.MULTIPART)
				.post(base_url+Path.Add_a_new_policy_for_the_company);
		

System.out.println(response.getStatusLine());
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Add_a_new_policy_for_the_company", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Add_a_new_policy_for_the_company", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

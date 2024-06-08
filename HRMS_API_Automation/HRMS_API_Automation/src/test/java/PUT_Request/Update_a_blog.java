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
import Base_Package.Utility_Class;
import GET_Request.Get_all_the_available_Appraisal_types;
import GET_Request.Get_all_the_available_SalaryRange;
import GET_Request.Get_all_the_blogs_of_the_company;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_a_blog extends Login{
	static ExtentTest Message;
	@Test
	public static void update_a_blog() throws IOException {
		Message=extent.createTest("Update_a_blog").assignAuthor(AutherT).assignCategory(Put);
		login();
	  	Random_data_From_Excel.main("PUT", 27, 1, 5);
	  	Get_all_the_blogs_of_the_company.get_all_the_blogs_of_the_company();
	
	Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)
				.body("{\"id\":\""+Get_all_the_blogs_of_the_company.id+"\","
						+Random_data_From_Excel.data+"}")
				.put(base_url+Path.Update_a_blog);
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_a_blog", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_a_blog", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

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
import GET_Request.Get_all_the_appraisal_reports;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_an_appraisal_report extends Login{
	static ExtentTest Message;
	@Test
	public static void update_an_appraisal_report() throws IOException {
		Message=extent.createTest("Update_an_appraisal_report").assignAuthor("QA_Team").assignCategory("PUT_Request");
		login();
		Get_all_the_appraisal_reports.get_all_the_appraisal_reports();
		Random_data_From_Excel.main("PUT", 21, 1, 1);	
	Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)
				.body("{\"id\":\"" + Get_all_the_appraisal_reports.id + "\","
					    + "\"employee_id\":\"" + Get_all_the_appraisal_reports.employee_id + "\","
					    + "\"review_type_id\":\"" + Get_all_the_appraisal_reports.review_type_id + "\","					    		
					    + Random_data_From_Excel.data + "}")
				.put(base_url+Path.Update_an_appraisal_report);
		JsonPath JP = response.jsonPath(); 
		System.out.println(response.getStatusLine());
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_an_appraisal_report", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_an_appraisal_report", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

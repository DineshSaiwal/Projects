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
import GET_Request.Get_all_the_available_Grades;
import GET_Request.Get_all_the_available_kras;
import GET_Request.Get_all_the_employees;
import GET_Request.Get_all_the_performance_reports;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class New_Update_performance_report_direct extends Login{
	static ExtentTest Message;
	@Test
	public static void Update_performance_report_direct() throws IOException {
		Message=extent.createTest("Update_performance_report_direct").assignAuthor(AutherT).assignCategory(Put);
		login();
		Random_data_From_Excel.main("PUT", 16, 1, 1);
		
		Get_all_the_performance_reports.get_all_the_performance_reports();
		Get_all_the_employees.get_all_the_employees();
			
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)
				.body("{\"id\":\"" + Get_all_the_performance_reports.id + "\"," 
				+ "\"employee_id\":\"" + Get_all_the_employees.id + "\"," 
				+ "\"review_type_id\":\"" + Get_all_the_performance_reports.review_type_id + "\"," 
				+ "\"created_by\":\"" + Get_all_the_performance_reports.created_by + "\"," 
				+ Random_data_From_Excel.data +"}")
				.put(base_url+Path.New_Update_performance_report_direct);
	
		System.out.println(response.getStatusLine());
		JsonPath JP = response.jsonPath(); 
		
//Validation 
		if(response.getStatusCode()==200){
			Message.pass(MarkupHelper.createLabel("Update_performance_report_direct", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_performance_report_direct", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}

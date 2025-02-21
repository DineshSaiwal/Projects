package Base_Package;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ReportStats;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Base_Class {
	public static WebDriver driver;
	public static String  browserName;
	public static ExtentReports extent;
	public static  String userdir = System.getProperty("user.dir");
    public static Set<String> browserNames = new HashSet<>();

	
	ExtentSparkReporter sparkReporter;

    @BeforeSuite
	public void generateReport() throws IOException{
		sparkReporter =new ExtentSparkReporter("Powergear Automation Report.html");
		sparkReporter.loadXMLConfig(new File(userdir+"\\extentconfig.xml"));
		extent = new ExtentReports();
	    extent.attachReporter(sparkReporter);	
	    extent.setSystemInfo("Project_Name", "Powergear");
	    extent.setSystemInfo("Environment", "QA");}
	
    
// 	@Parameters("Browser_Name")
//	@BeforeClass 
//	public void Browser_Launch(String Browser_Name) throws IOException{
//		if(Browser_Name.equalsIgnoreCase("chrome")){
//				WebDriverManager.chromedriver().setup();
//				ChromeOptions options=new ChromeOptions();
//				options.addArguments("--remote-allow-origins=*","start-maximized");
//				driver=new ChromeDriver(options);
//				browserName = ((ChromeDriver) driver).getCapabilities().getBrowserName();
//					}
//		else if(Browser_Name.equalsIgnoreCase("Edge")) {
//				WebDriverManager.edgedriver().setup();
//				driver=new EdgeDriver();	
//				driver.manage().window().maximize();
//		        browserName = ((EdgeDriver) driver).getCapabilities().getBrowserName();
//					}
//		else if(Browser_Name.equalsIgnoreCase("FireFox")) {
//	        	WebDriverManager.firefoxdriver().setup();
//	        	driver=new FirefoxDriver();
//	        	driver.manage().window().maximize();
//				browserName = ((FirefoxDriver) driver).getCapabilities().getBrowserName();
//					}
//		driver.get("https://truplant.aptagrim.co/auth/signin");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		browserNames.add(browserName);
//					}
 	
 	 
	@BeforeClass 
	public void Browser_Launch() throws IOException{
				WebDriverManager.chromedriver().setup();
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*","start-maximized");
				driver=new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				browserName = ((ChromeDriver) driver).getCapabilities().getBrowserName();
				driver.get("https://powergear.aptagrim.co/");
	
				browserNames.add(browserName);
					}


//	@AfterTest
//	public void Execution_Results() {
//
//		ReportStats Stats = extent.getStats();	    
//	    Map<Status, Float> Parent_percentage = Stats.getParentPercentage();
//	    
//	    for (Map.Entry<Status, Float> details : Parent_percentage.entrySet()) {
//	  	  	Status key = details.getKey();
//	          Float value = details.getValue();
//	          if (key.equals(Status.PASS)) {
//	          		Pass=key.toString();
//	          		P_Percentage=value.toString();
//	          		}
//	          if (key.equals(Status.FAIL)) {
//	          	 	Fail=key.toString();
//	          	 	F_Percentage=value.toString();
//	          		}
//	          }
//        
//	    Map<Status, Long> Total_Scripts =Stats.getParent();	 
//        for (Map.Entry<Status, Long> details : Total_Scripts.entrySet()) {
//  	  		Status key = details.getKey();
//  	  		Long value = details.getValue();
//          if (key.equals(Status.PASS)) {
//	          	T_Pass=key.toString();
//	          	P_Scrips=value.toString();
//          		}
//          if (key.equals(Status.FAIL)) {
//	          	T_Fail=key.toString();
//	          	F_Scripts=value.toString();
//          		}
//          }
//        
//        List<Test> testList = extent.getReport().getTestList();
//        int totalTestScripts = testList.size();
//        
//         result = "Total Scripts : " + totalTestScripts + "\n"
//                + Pass + " : " + P_Percentage + "%" + "\n"
//                + Fail + " : " + F_Percentage + "%" + "\n"
//                + T_Pass + " Scripts : " + P_Scrips + "\n"
//                + T_Fail + " Scripts : " + F_Scripts+ "\n"
//                +"Executed on browser : " + browserNames;
//	}
//  
//	
		@AfterClass
		public void Close_Browser() {
			driver.close();
			extent.flush();
		}
	
	
		@AfterSuite
		public void Send_Mail() throws IOException {  
//			Java_Mail.sendmail();    
			Desktop.getDesktop().browse(new File("Powergear Automation Report.html").toURI());
			  	}
		}



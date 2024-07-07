package Base_Package;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.mail.EmailException;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
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
//	public static WebDriver driver;
	public static String  browserName;
	public static ExtentReports extent;
	ExtentSparkReporter sparkReporter;  
	
    public static Set<String> browserNames = new HashSet<>();
    public static String Pass;
	public static String P_Percentage;
	public static String Fail;
	public static String F_Percentage;
	
	public static String T_Pass;
	public static String P_Scrips;
	public static String T_Fail;
	public static String F_Scripts;
	public static String result;
	
	
    @BeforeSuite
	public void generateReport() throws IOException{
		sparkReporter =new ExtentSparkReporter("PsyHire_Automation_Report.html");
		sparkReporter.loadXMLConfig(new File(Utility_Class.userdir+"\\extentconfig.xml"));
		extent = new ExtentReports();
	    extent.attachReporter(sparkReporter);	
	    extent.setSystemInfo("Project_Name", "PsyHire");
	    extent.setSystemInfo("Environment", "Production");}
	
    
    
    
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeClass
    @Parameters({"Browser_Name", "url"})
    public void setUp(String Browser_Name, String url) {
        WebDriver driverInstance;
        if (Browser_Name.equalsIgnoreCase("chrome")) {
        	ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*", "start-maximized");
            driverInstance = new ChromeDriver(options);
            browserName = ((ChromeDriver) driverInstance).getCapabilities().getBrowserName();} 
        else if (Browser_Name.equalsIgnoreCase("firefox")) {
        	driverInstance = new FirefoxDriver();
            browserName = ((FirefoxDriver) driverInstance).getCapabilities().getBrowserName();
            driverInstance.manage().window().maximize();} 
       else if (Browser_Name.equalsIgnoreCase("edge")) {
        	EdgeOptions options = new EdgeOptions();
            options.addArguments("start-maximized");
            driverInstance = new EdgeDriver(options);
            browserName = ((EdgeDriver) driverInstance).getCapabilities().getBrowserName();} 
        else {
            throw new IllegalArgumentException("Unsupported browser: " + Browser_Name);
        	}
        
		browserNames.add(browserName);
        driver.set(driverInstance);
        driverInstance.get(url);
        driverInstance.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public static WebDriver getDriver() {
        return driver.get();
    }


	@AfterTest
	public void Execution_Results() {

		ReportStats Stats = extent.getStats();	    
	    Map<Status, Float> Parent_percentage = Stats.getParentPercentage();
	    
	    for (Map.Entry<Status, Float> details : Parent_percentage.entrySet()) {
	  	  	Status key = details.getKey();
	          Float value = details.getValue();
	          if (key.equals(Status.PASS)) {
	          		Pass=key.toString();
	          		P_Percentage=value.toString();
	          		}
	          if (key.equals(Status.FAIL)) {
	          	 	Fail=key.toString();
	          	 	F_Percentage=value.toString();
	          		}
	          }
        
	    Map<Status, Long> Total_Scripts =Stats.getParent();	 
        for (Map.Entry<Status, Long> details : Total_Scripts.entrySet()) {
  	  		Status key = details.getKey();
  	  		Long value = details.getValue();
          if (key.equals(Status.PASS)) {
	          	T_Pass=key.toString();
	          	P_Scrips=value.toString();
          		}
          if (key.equals(Status.FAIL)) {
	          	T_Fail=key.toString();
	          	F_Scripts=value.toString();
          		}
          }
        
        List<Test> testList = extent.getReport().getTestList();
        int totalTestScripts = testList.size();
        
         result = "Total Scripts : " + totalTestScripts + "\n"
                + Pass + " : " + P_Percentage + "%" + "\n"
                + Fail + " : " + F_Percentage + "%" + "\n"
                + T_Pass + " Scripts : " + P_Scrips + "\n"
                + T_Fail + " Scripts : " + F_Scripts+ "\n"
                +"Executed on browser : " + browserNames;
	}
  
	
		@AfterClass
		public void Close_Browser() {
			getDriver().quit();
			driver.remove();
			extent.flush();
		}
	
		
		@AfterSuite
		public void Send_Mail() throws EmailException, IOException {  
			Java_Mail.sendmail();    
			Desktop.getDesktop().browse(new File("PsyHire_Automation_Report.html").toURI());
			  	}
		}



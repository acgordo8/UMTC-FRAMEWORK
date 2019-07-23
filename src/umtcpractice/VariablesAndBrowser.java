package umtcpractice;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
	
public class VariablesAndBrowser {

	
	
public static WebDriver driver;
public static WebDriver getDriver() {
    return driver;
}

	

	String website = new String ("https://umtc.dice205.asia/wp-login.php");
	String ChromePATH = new String ("C:\\Users\\DICE205\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
	String ChromeBIN = new String ("webdriver.chrome.driver");
	String Home = new String ("");
	String ABOUTUS = new String ("");
			String COMPANYPROFILE = new String ("//*[@id=\"post-28\"]/td[1]/strong/a");//
			String VISIONMISSION = new String ("//*[@id=\"post-32\"]/td[1]/strong/a");//		UNDER ABOUT US PAGE
			String ACCREDITATIONS= new String ("//*[@id=\"post-42\"]/td[1]/strong/a");//
			String OURTEAM = new String ("//*[@id=\"post-46\"]/td[1]/strong/a");//
			
			
	String FACILITIES = new String ("");
	String COURSES = new String ("//*[@id=\"post-328\"]/td[1]/strong/a");
	String CERTIFICATE = new String ("");
	String CAREERS = new String ("//*[@id=\"post-328\"]/td[1]/strong/a");
	
	String PORTAL = new String ("");
			String Username = new String ("");	//
			String Password = new String ("");	//
			
	String DOWNLOADS = new String ("");
	String CONTACTUS = new String ("");
	
	String DisableNotification = new String ("");
	
	@Parameters("browser")
	@BeforeClass
	public void MultipleBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(ChromeBIN, ChromePATH);
			ChromeOptions options = new ChromeOptions();     
		    options.addArguments("--headless"); 
			driver = new ChromeDriver();
			//driver.getWindowHandle();
			driver.get(website);
			//driver.manage().window().maximize();
			            
		}
	}
	
	@AfterSuite
	public void aftersuite() {
		
		driver.quit();
	}
	
}

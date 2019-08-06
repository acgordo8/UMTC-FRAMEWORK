package umtcpractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
	
public class VariablesAndBrowser {
	
		
		private static WebDriver driver;
		public static WebDriver getDriver() {
			
			return driver;
		}
		
		


	

	String website = new String ("https://umtc.dice205.asia/wp-login.php");
	String ChromePATH = new String ("C:\\Users\\DICE205\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
	String ChromeBIN = new String ("webdriver.chrome.driver");
	String FIREFOXPATH = new String ("C:\\Users\\DICE205\\eclipse-workspace\\Salto-Framework\\lib\\drivers\\geckodriver.exe");
	String FIREFOXBIN = new String ("webdriver.gecko.driver");
	String EDGEPATH = new String ("C:\\Users\\DICE205\\eclipse-workspace\\Salto-Framework\\lib\\drivers\\IEDriverServer.exe");
	String EDGEBIN = new String ("webdriver.edge.driver");
	
	
	
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
	
	
	@BeforeSuite
	public void singlebrowsermultipleclasses() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DICE205\\eclipse-workspace\\UMTC-FRAMEWORK\\lib\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	     driver.get(website);
	}
	
	/*@Parameters("browser")
	@BeforeSuite
	public void MultipleBrowser(String browser) throws Exception {

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(ChromeBIN, ChromePATH);
			//ChromeOptions options = new ChromeOptions();     
		    //options.addArguments("--headless"); 
			driver = new ChromeDriver();
			driver.getWindowHandle();
			driver.get(website);
			//driver.manage().window().maximize();          
		}
		else if(browser.equalsIgnoreCase("firefox")) {   
			System.setProperty(FIREFOXBIN, FIREFOXPATH);
			driver = new FirefoxDriver();
			driver.getWindowHandle();
			driver.get(website);
		}else if(browser.equalsIgnoreCase("edge")) {   
			System.setProperty(EDGEBIN, EDGEPATH);
			driver = new EdgeDriver();
			driver.getWindowHandle();
			driver.get(website);
		}else {
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
	
	
	
	@AfterSuite
	public void aftersuite() {
		driver.quit();
	}
	
}

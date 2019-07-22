package umtcpractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleExtent{


	public WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	
@BeforeTest
public void BeforeTest() {	
		ExtentFunctions delete = new ExtentFunctions();   //delete existing extent-report 
		delete.DeleteExtentReport();
		
		
		report = ExtentFunctions.getInstance();
		report.loadConfig(new File("C:\\Users\\DICE205\\eclipse-workspace\\UMTC-FRAMEWORK\\extent-config.xml")); // Assigned to

}

@BeforeClass
public void BeforeClass() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DICE205\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
	

	driver = new ChromeDriver();
	driver.getWindowHandle();
	driver.manage().window().maximize();
	driver.get("https://umtc.dice205.asia/wp-login.php");
	
}

@Test(priority = 1)
public void Login() {
	
	test = report.startTest("Login Users");
	test.log(LogStatus.INFO, "Enter Username");
	driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
	test.log(LogStatus.INFO, "Enter Password");
	driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
	test.log(LogStatus.INFO, "Click Remember me");
	driver.findElement(By.id("rememberme")).click();
	test.log(LogStatus.INFO, "Submit Buttons");
	driver.findElement(By.id("wp-submit")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
}






@AfterTest
public void AfterTest() {
	report.endTest(test);
	report.flush();
}

@AfterMethod
public void CheckResults(ITestResult testResults) {

	if (testResults.getStatus() == ITestResult.FAILURE) {
		test.log(LogStatus.FAIL, "Test Case Failed because of below poblem");
		test.log(LogStatus.FAIL, testResults.getThrowable());
	} else if (testResults.getStatus() == ITestResult.SUCCESS) {
		test.log(LogStatus.PASS, "Test Case is passed");
	} else if (testResults.getStatus() == ITestResult.SKIP) {
		test.log(LogStatus.SKIP, testResults.getThrowable());
	}
}
}

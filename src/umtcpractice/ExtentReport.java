 package umtcpractice;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport extends VariablesAndBrowser {

	
	 ExtentTest test;
	 ExtentReports report;
	
	
	@Test(priority = 0)
	public void starttest() {
		
		report = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReportResults.html");
		report.addSystemInfo("Host Name","Local Host");
		report.addSystemInfo("Environment","QA");
		report.addSystemInfo("Tester Name","Alexander Gordo");
		report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));

		
	}
	
	@Test(priority = 1)
	public void extentReportsDemo() throws InterruptedException{
	
		test = report.startTest("extentReportsDemo");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert Pass");
		
		
			driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
			driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
			driver.findElement(By.id("rememberme")).click();
			driver.findElement(By.id("wp-submit")).click();
					
			Thread.sleep(2000);
		}	

	}
	



		

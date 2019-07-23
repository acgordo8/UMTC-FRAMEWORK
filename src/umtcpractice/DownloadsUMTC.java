package umtcpractice;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import umtcpractice.ExtentFunctions;


public class DownloadsUMTC extends VariablesAndBrowser {
	
	
	
	ExtentReports report;
	ExtentTest test;


	
	//File upload using Sikuli framework
	String filepath = "C:\\Users\\DICE205\\Downloads\\";
	String inputFilePath = "C:\\Users\\DICE205\\Downloads\\";
	Screen s = new Screen();
    Pattern fileInputTextBox = new Pattern(filepath + "filetextbox.JPG");
    Pattern openButton = new Pattern(filepath + "Open.JPG");
    
	
	@BeforeTest
	public void BeforeTest() {	
			ExtentFunctions delete = new ExtentFunctions();   //delete existing extent-report 
			delete.DeleteExtentReport();
			
			
			report = ExtentFunctions.getInstance();
			report.loadConfig(new File("C:\\Users\\DICE205\\eclipse-workspace\\UMTC-FRAMEWORK\\extent-config.xml")); // Assigned to
																								// xampp/htdocs/PBAL-Automationextent-config	
	}

   
	@Test(priority = 1)
	public void lumagda() throws Exception {
		
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
		
		//Thread.sleep(3000);
	}	
    
    
	@Test (priority = 2, dependsOnMethods= {"lumagda"})
	public void downloads() throws InterruptedException, FindFailed {
		test = report.startTest("Downloads");
		test.log(LogStatus.INFO, "Hover Downloads");
		WebElement download = driver.findElement(By.linkText("Downloads"));
		Actions action = new Actions(driver);
		action.moveToElement(download).build().perform();
		Thread.sleep(3000);

		test.log(LogStatus.INFO, "Click Add new");
		driver.findElement(By.xpath("//*[@id=\"menu-posts-download\"]/ul/li[3]/a")).click();
		
		test.log(LogStatus.INFO, "Inputing Text in TextField");
		driver.findElement(By.id("title")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Welcome UMTC");
		Thread.sleep(3000);
		
		
		
		//Select Files
		test.log(LogStatus.INFO, "Click File Upload");
		driver.findElement(By.id("file-upload")).click();
		        s.wait(fileInputTextBox, 20);
		        s.type(fileInputTextBox, inputFilePath + "index.JPG");
		        s.click(openButton);
		Thread.sleep(3000);
		
		test.log(LogStatus.INFO, "Clicking Publish");
		driver.findElement(By.id("publish")).click();
		Thread.sleep(2000);
		//test.log(LogStatus.INFO, "Clicking Preview");
		//driver.findElement(By.id("post-preview")).click();
	

	}
	
	@AfterMethod
	public void CheckResults(ITestResult testResults) throws IOException {

		if (testResults.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = GetScreenShot.capture(driver,"screenShotName");
			test.log(LogStatus.FAIL, testResults.getThrowable());
			test.log(LogStatus.FAIL, "Test Case Failed because of below poblem" + test.addScreenCapture(screenShotPath));
		}  else if (testResults.getStatus() == ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, "Test Case is passed");
		} else if (testResults.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, testResults.getThrowable());
		}
	
		report.flush();
	}
	

}

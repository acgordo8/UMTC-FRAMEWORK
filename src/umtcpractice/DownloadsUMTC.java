package umtcpractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import umtcpractice.ExtentFunctions;


public class DownloadsUMTC  {
	
	public WebDriver driver;
	ExtentReports report = null;
	ExtentTest test = null;

	
	//File upload using Sikuli framework
	String filepath = "C:\\Users\\DICE205\\Downloads\\";
	String inputFilePath = "C:\\Users\\DICE205\\Downloads\\";
	Screen s = new Screen();
    Pattern fileInputTextBox = new Pattern(filepath + "filetextbox.JPG");
    Pattern openButton = new Pattern(filepath + "Open.JPG");
    
 
    @BeforeClass
    public void setupClass() {
    	// Initialize browser
    	WebDriver driver =new ChromeDriver();
    	 
    }
    
    @BeforeTest
    public void ExtentBeforeTest() {
    	
    	ExtentFunctions delete = new ExtentFunctions();   //delete existing report
		delete.DeleteExtentReport();
		
		report = ExtentFunctions.getInstance();
		report.loadConfig(new File("C:\\Users\\DICE205\\eclipse-workspace\\UMTC-FRAMEWORK\\extent-config.xml")); 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DICE205\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
   	 
		// Open facebook
    	driver.get("https://umtc.dice205.asia/wp-login.php");
    	 
    	// Maximize browser
    	 
    	driver.manage().window().maximize();

    }
	
	@Test(priority = 0)
	public void lumagda() {
		

    	
		
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
    
    
	
	@Test (priority = 1, dependsOnMethods= {"lumagda"})
	public void downloads() throws InterruptedException, FindFailed {
		
		WebElement download = driver.findElement(By.linkText("Downloads"));
		Actions action = new Actions(driver);
		action.moveToElement(download).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-posts-download\"]/ul/li[3]/a")).click();
		
		
		driver.findElement(By.id("title")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Welcome UMTC");
		Thread.sleep(3000);
		
		
		
		//Select Files
		driver.findElement(By.id("file-upload")).click();
		        s.wait(fileInputTextBox, 20);
		        s.type(fileInputTextBox, inputFilePath + "index.JPG");
		        s.click(openButton);
		Thread.sleep(3000);
		
		driver.findElement(By.id("publish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("post-preview")).click();
		      

	}

}

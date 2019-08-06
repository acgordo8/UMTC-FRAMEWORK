package umtcpractice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class AboutUsUMTC{

	
	ExtentReports report;
	ExtentTest test;
	
/*	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}	*/
		
	@Test(priority = 1)
	public void aboutus() throws InterruptedException {
		
		WebElement pages = VariablesAndBrowser.getDriver().findElement(By.linkText("Pages"));
		Actions action = new Actions(VariablesAndBrowser.getDriver());
		action.moveToElement(pages).build().perform();
		Thread.sleep(3000);
		
		VariablesAndBrowser.getDriver().findElement(By.partialLinkText("All")).click();
		Thread.sleep(3000);
		VariablesAndBrowser.getDriver().findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/a")).click();
		Thread.sleep(3000);
		//Close Notification
		VariablesAndBrowser.getDriver().findElement(By.cssSelector("#editor > div > div > div > div:nth-child(6) > div > div > div > div > button")).click();
		VariablesAndBrowser.getDriver().findElement(By.id("post-title-0")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Information Technology");
		Thread.sleep(3000);
		VariablesAndBrowser.getDriver().findElement(By.xpath("//*[@id=\"mce_0\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Information Technology");
		
		
	}
}

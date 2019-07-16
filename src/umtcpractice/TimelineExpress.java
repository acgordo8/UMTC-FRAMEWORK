package umtcpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TimelineExpress extends VariablesAndBrowser {

	
	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}	
	
	
	@Test(priority = 1)
	public void timeline() throws InterruptedException {
		
	
	WebElement timeline = driver.findElement(By.partialLinkText("Timeline"));
	Actions action = new Actions(driver);
	action.moveToElement(timeline).build().perform();
	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("New")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("title")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Information Technology");
	Thread.sleep(3000);
	
	//Select Dropdown = new Select (driver.findElement(By.cssSelector("#cmb2-metabox-announcement_metabox > div.cmb-row.cmb-type-te-bootstrap-dropdown.cmb2-id-announcement-icon > div.cmb-td > div > button")));
	//Thread.sleep(3000);
	//Dropdown.selectByIndex(5);
	
	
	WebElement icon = driver.findElement(By.cssSelector("#cmb2-metabox-announcement_metabox > div.cmb-row.cmb-type-te-bootstrap-dropdown.cmb2-id-announcement-icon > div.cmb-td > div > button"));
	icon.click();
	Thread.sleep(3000);
	
	// Create instance of Javascript executor
	JavascriptExecutor je = (JavascriptExecutor) driver;
	//Identify the WebElement which will appear after scrolling down
	WebElement element = driver.findElement(By.linkText("angle-down"));
	// now execute query which actually will scroll until that element is not appeared on page.
	je.executeScript("arguments[0].scrollIntoView(true);",element);
	Thread.sleep(5000);
	je.executeScript("arguments[0].click();", element);
	
	
	//driver.findElement(By.partialLinkText("align")).click();
	
	}
}



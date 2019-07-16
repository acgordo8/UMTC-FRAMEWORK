package umtcpractice;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderTesting extends VariablesAndBrowser {
	
	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}	
	
	@Test(priority = 1)
	public void slider () throws InterruptedException, IOException {
		
		WebElement contact = driver.findElement(By.linkText("Slider"));
		Actions action = new Actions(driver);
		action.moveToElement(contact).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Add")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("title")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Information Technology");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#menu_order")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"1");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#set-post-thumbnail")).click();
		driver.findElement(By.partialLinkText("Upload")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("__wp-uploader-id-1")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\DICE205\\Documents\\SliderTest.exe");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#__wp-uploader-id-0 > div.media-frame-toolbar > div > div.media-toolbar-primary.search-form > button")).click();
		System.out.println("Successfully Uploaded");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#publish")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#post-preview")).click();
		
		
	}
}

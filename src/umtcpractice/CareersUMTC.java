package umtcpractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CareersUMTC extends VariablesAndBrowser {
	
	
	
	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}	

	
	
	
	@Test(priority = 1)
	public void careers() throws InterruptedException, IOException {
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"menu-posts-career\"]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(contact).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Add New")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Fill up Title & Body form
				driver.findElement(By.id("title")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Information Technology");
			
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			driver.findElement(By.id("content-html")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#content")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Information Technology");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"set-post-thumbnail\"]")).click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.xpath("//*[@id=\"__wp-uploader-id-0\"]/div[3]/div/a[1]")).click();
			driver.findElement(By.id("__wp-uploader-id-1")).click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\Users\\DICE205\\Documents\\Upload.exe");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#__wp-uploader-id-0 > div.media-frame-toolbar > div > div.media-toolbar-primary.search-form > button")).click();
			System.out.println("Successfully Uploaded");
			
			Thread.sleep(5000);
			

			driver.findElement(By.id("publish")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#post-preview")).click();
			
	}

}
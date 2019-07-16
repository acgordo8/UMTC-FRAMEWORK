package umtcpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class HomeUMTC extends VariablesAndBrowser {
	
	
	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}
	
	@Test(priority = 1, dependsOnMethods= {"lumagda"})
	public void Home() throws InterruptedException, FindFailed {
	
		//Hover to Posts
		WebElement home = driver.findElement(By.linkText("Posts"));
		Actions action = new Actions(driver);
		action.moveToElement(home).build().perform();
		//Click Add New
		driver.findElement(By.partialLinkText("Add")).click();
		Thread.sleep(3000);
		
		
		//Close Notification
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[6]/div/div/div/div/button")).click();
		
		
		//Fill up Title & Body form
		driver.findElement(By.id("post-title-0")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Welcome UMTC");
		Thread.sleep(3000);
		
		//Click Set featured image
		driver.findElement(By.partialLinkText("Fea")).click();
				
	
		//Click Stick to the Front Page
		driver.findElement(By.id("inspector-checkbox-control-6")).click();

		
	}
	
}

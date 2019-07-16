package umtcpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class FacilitiesUMTC extends VariablesAndBrowser {

	
	
	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}
	
	@Test(priority = 1,  dependsOnMethods= {"lumagda"})
	public void Addfacilities() throws InterruptedException {
		
		driver.findElement(By.linkText("Facilities")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Add")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"INFORMATION TECHNOLOGY");
		Thread.sleep(3000);
		driver.findElement(By.id("set-post-thumbnail")).click();
		Thread.sleep(3000);
		/*driver.findElement(By.linkText("Insert from URL")).click();*/
		
		driver.findElement(By.cssSelector("#__wp-uploader-id-0 > div.media-frame-router > div > a.media-menu-item.active")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__attachments-view-1417\"]/li[6]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__wp-uploader-id-0\"]/div[5]/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-preview\"]")).click();
	}
}



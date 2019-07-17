package umtcpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Appearance extends VariablesAndBrowser{

	
	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}	
	
	@Test(priority = 1)
	public void appearance() throws InterruptedException {
		
		WebElement appear = driver.findElement(By.linkText("Appearance"));
		
		Actions action = new Actions(driver);
		action.moveToElement(appear).build().perform();
		Thread.sleep(3000);
	
		driver.findElement(By.linkText("Menus")).click();
		
		WebElement SourceLocator = driver.findElement(By.xpath("//*[@id=\"menu-item-67\"]/div[1]/div"));
		WebElement TargetLocation = driver.findElement(By.xpath("//*[@id=\"menu-item-68\"]/div[1]/div"));
		
		action.dragAndDrop(SourceLocator, TargetLocation).build().perform();
		driver.findElement(By.id("save_menu_footer")).click();
	}

}

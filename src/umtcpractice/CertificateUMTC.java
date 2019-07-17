package umtcpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CertificateUMTC extends VariablesAndBrowser{

	
	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}	
	
	@Test(priority = 1)
	public void robots() throws InterruptedException, AWTException {
		
		WebElement robotschie = driver.findElement(By.linkText("Facilities"));
		Actions action = new Actions(driver);
		action.moveToElement(robotschie).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Add")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"set-post-thumbnail\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Media")).click();
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		robot.mouseMove(500,350);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		//robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#__wp-uploader-id-0 > div.media-frame-toolbar > div > div.media-toolbar-primary.search-form > button")).click();
		System.out.println("Successfully Uploaded");
		
		Thread.sleep(5000);
		 
		
		
		

	}
}

package umtcpractice;

import static org.testng.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ContactUMTC extends VariablesAndBrowser {

	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void contact() throws InterruptedException {
		
		driver.findElement(By.linkText("Contact Us Page")).click();
		Thread.sleep(3000);
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"post-575\"]/td[1]/strong/a"));
		Actions action = new Actions(driver);
		action.moveToElement(contact).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"post-575\"]/td[1]/div[3]/span[1]/a")).click();
		Thread.sleep(3000);
		
		
		WebElement countryUL= driver.findElement(By.xpath("//*[@id=\"content\"]"));
		List<WebElement> countriesList=countryUL.findElements(By.tagName("strong[1]"));
		for (WebElement strong : countriesList) {
		if (strong.getText().equals("<strong>United Marine Training Center, Inc.</strong>\r\n" + 
				"2120 Leon Guinto Street Malate,\r\n" + 
				"1004 Malate, Manila, Philippines\r\n" + 
				"T: +63 2 981 6682\r\n" + 
				"F: +63 2 981 6601")) {
		     strong.sendKeys(Keys.chord(Keys.CONTROL, "a"),"Sample");
		   }
		}
		    
		    Thread.sleep(3000);
		//driver.switchTo().frame(driver.findElement(By.id("//*[@id=\"tinymce\"]")));
		//driver.findElement(By.cssSelector("#tinymce > p:nth-child(1)")).click();	
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p[1]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Sample");
		
	
		
		
	}
}

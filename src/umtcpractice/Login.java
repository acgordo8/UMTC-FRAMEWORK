package umtcpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Login extends VariablesAndBrowser {
	

	
	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}
		/*WebElement AccSettings = driver.findElement(By.id("wp-admin-bar-my-account"));
	    AccSettings.click();

	   
	    WebDriverWait wait = new WebDriverWait(driver, 8);
	    WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.id("wp-admin-bar-logout")));
	    logout.click();

	    
	    Thread.sleep(2000);*/
	
	
	/*
	@Test(priority = 1, dependsOnMethods={"lumagda"})
	public void aboutUs() throws InterruptedException {
		driver.findElement(By.linkText("Pages")).click();
		driver.findElement(By.linkText("QA TEAMS")).click();
		
		//Close Notification
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[6]/div[1]/div/div/div/button")).click();
		//Textbox Change Text
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-title-0\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"About Us");
		//Update
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/button[2]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		}
		/*WebDriverWait wait=new WebDriverWait(driver,20);
 
		// Wait till the element is not visible
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ur xpath here")));
		element.click();*/
		
		/*Thread.sleep(3000);
		driver.navigate().to(COMPANYPROFILE);
		Thread.sleep(3000);*/
	
		@Test(priority = 2,dependsOnMethods={"aboutUs"})
		public void company()throws InterruptedException {
		//Company Profile
				driver.findElement(By.xpath(COMPANYPROFILE)).click();
		
				//Textbox Changed Text
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"post-title-0\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Company");
				//Update
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/button[2]")).click();
				Thread.sleep(3000);
				driver.navigate().back();
				/*Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[5]/div[3]/div[4]/h2/button")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[5]/div[3]/div[4]/div/button[2]")).click();
				Thread.sleep(3000);
				
				WebElement element = driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[5]/div[3]/div[4]/div/button[1]/div/img"));    
				((JavascriptExecutor)driver).executeScript("arguments[0].src='"+pathToNewImage+"'", imageElement);
				
				driver.findElement(By.xpath("//*[@id=\"__attachments-view-53\"]/li[6]/div/div/div/img")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__wp-uploader-id-0\"]/div[5]/div/div[2]/button")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/a")).click(); */
				
		
	}
		@Test(priority = 3, dependsOnMethods= {"company"})
		public void vimision() throws InterruptedException {
			
			driver.findElement(By.xpath(VISIONMISSION)).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"post-title-0\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Vision & Mission");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/button[2]")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			
		}
		
		
		@Test(priority = 4, dependsOnMethods= {"vimision"})
		public void accreditations() throws InterruptedException {
			
			driver.findElement(By.xpath(ACCREDITATIONS)).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"post-title-0\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Accreditations");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/button[2]")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			
		}
		
		@Test(priority = 5, dependsOnMethods= {"accreditations"})
		public void ourteams() throws InterruptedException {
			
			driver.findElement(By.xpath(OURTEAM)).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"post-title-0\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Our Teams");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/button[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/a")).click();
			driver.navigate().refresh();
			driver.navigate().back();
			
		}

	
}

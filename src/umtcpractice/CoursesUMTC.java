package umtcpractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CoursesUMTC extends VariablesAndBrowser{

	
	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 1, dependsOnMethods= {"lumagda"})
	public void courses() throws InterruptedException, IOException{
	

		driver.findElement(By.linkText("Courses")).click();
		driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#title")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Information Technology");
		Thread.sleep(3000);
		
		
		
	/*	//Close Notification
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[6]/div/div/div/div/button")).click();
		Thread.sleep(2000);		*/
		
		 driver.findElement(By.id("pdf-file")).click();
		 Thread.sleep(3000);
		 Runtime.getRuntime().exec("C:\\Users\\DICE205\\Documents\\PDF.exe");
		 Thread.sleep(3000);
		 driver.findElement(By.id("in-course_category-15")).click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.cssSelector("#publish")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#post-preview")).click();
	}
	
}

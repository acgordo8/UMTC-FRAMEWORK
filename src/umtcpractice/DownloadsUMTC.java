package umtcpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DownloadsUMTC extends VariablesAndBrowser {
	
	
	//File upload using Sikuli framework
	String filepath = "C:\\Users\\DICE205\\Downloads\\";
	String inputFilePath = "C:\\Users\\DICE205\\Downloads\\";
	Screen s = new Screen();
    Pattern fileInputTextBox = new Pattern(filepath + "filetextbox.JPG");
    Pattern openButton = new Pattern(filepath + "Open.JPG");
	
	
	@Test(priority = 0)
	public void lumagda() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("umtc_admin");
		driver.findElement(By.id("user_pass")).sendKeys("92R2$Hg@d4TYgW3r3x");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
				
		Thread.sleep(2000);
	}	
    
    
	
@Test (priority = 1, dependsOnMethods= {"lumagda"})
public void downloads() throws InterruptedException, FindFailed {
		
		WebElement download = driver.findElement(By.linkText("Downloads"));
		Actions action = new Actions(driver);
		action.moveToElement(download).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-posts-download\"]/ul/li[3]/a")).click();
		
		
		driver.findElement(By.id("title")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Welcome UMTC");
		Thread.sleep(3000);
		
		
		
		//Select Files
		driver.findElement(By.id("file-upload")).click();
		        s.wait(fileInputTextBox, 20);
		        s.type(fileInputTextBox, inputFilePath + "index.JPG");
		        s.click(openButton);
		Thread.sleep(3000);
		
		driver.findElement(By.id("publish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("post-preview")).click();
		      

	}

}

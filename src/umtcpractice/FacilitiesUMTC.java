package umtcpractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
	public void Addfacilities() throws InterruptedException, IOException {
		
		//clicking facilities in side bar
		driver.findElement(By.linkText("Facilities")).click();
		Thread.sleep(3000);
		//Click add new
		driver.findElement(By.partialLinkText("Add")).click();
		
		//Enter Title
		driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"INFORMATION TECHNOLOGY");
		Thread.sleep(3000);
		//body text
		driver.findElement(By.id("content")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Information Technology");
		Thread.sleep(3000);
		//Click Add new Category
		driver.findElement(By.id("facility_category-add-toggle")).click();
		Thread.sleep(5000);
		//Category Name
		driver.findElement(By.id("newfacility_category")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Information Technology");
	
		//Click Dropdown
		WebElement Category = driver.findElement(By.id("newfacility_category_parent"));
		Category.click();
		Thread.sleep(3000);
		
		Select select = new Select (Category);
		select.selectByVisibleText("Simulator");
		
		//Click add new Category
		driver.findElement(By.id("facility_category-add-submit")).click();
		Thread.sleep(3000);
		
		
		
		//Set Featured Image
		driver.findElement(By.id("set-post-thumbnail")).click();
		Thread.sleep(3000);
		//Click Upload Files
		driver.findElement(By.partialLinkText("Upload")).click();
		Thread.sleep(3000);
		//Select Files
		driver.findElement(By.id("__wp-uploader-id-1")).click();
		//AutoIT tools to select specific files or images in desktop/laptop
		Runtime.getRuntime().exec("C:\\Users\\DICE205\\Documents\\Facilities.exe");
		Thread.sleep(5000);
		//Click set Featured Image
		driver.findElement(By.cssSelector("#__wp-uploader-id-0 > div.media-frame-toolbar > div > div.media-toolbar-primary.search-form > button")).click();
		System.out.println("Successfully Uploaded");
		
		Thread.sleep(5000);
		 
		//Click Publish
		driver.findElement(By.cssSelector("#publish")).click();
		Thread.sleep(5000);
		//Click Post-Review
		driver.findElement(By.cssSelector("#post-preview")).click();
		
		
	}
}



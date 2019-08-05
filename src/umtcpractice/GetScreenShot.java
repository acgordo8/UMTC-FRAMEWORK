package umtcpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenShot {

	public static String capture(WebDriver driver, String FailedTestCase) throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"//Screenshot//"+FailedTestCase+".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		
		return dest;
	}
	
}

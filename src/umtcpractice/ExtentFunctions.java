package umtcpractice;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class ExtentFunctions {


	ExtentReports report;
	ExtentTest test;
	
	//Delete first the existing UMTC_REPORTS.html before creating new one
		public void DeleteExtentReport() {
			File file = new File("C:\\Users\\DICE205\\eclipse-workspace\\UMTC-FRAMEWORK\\test-output\\UMTC_REPORTS.html");
	        if(file.delete()){
	        System.out.println("Existing UMTC_REPORTS.html is deleted!");
	        }else System.out.println("File UMTC_REPORTS doesn't exist");
		}
		
		//eclipse-workspace//UMTC_REPORTS path	
		public static ExtentReports getInstance() {
			ExtentReports extent;
			String Path = "C:\\Users\\DICE205\\eclipse-workspace\\UMTC-FRAMEWORK\\test-output\\UMTC_REPORTS.html"; 
			extent = new ExtentReports(Path, false);
			extent
			.addSystemInfo("Selenium Version", "3.14")
			.addSystemInfo("Platfom", "Windows 10");
			System.out.println("New UMTC_REPORTS.html will be created after executions of the test cases");
			return extent;
		}
		

}
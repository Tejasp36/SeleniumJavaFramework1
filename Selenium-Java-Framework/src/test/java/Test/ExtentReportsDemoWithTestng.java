package Test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoWithTestng 
{
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		htmlreporter=new ExtentHtmlReporter("extent.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
	}
	@BeforeTest
	public void setuptest()
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chrome/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void test() throws IOException
	{
		ExtentTest test = extent.createTest("My First Test","sample");
		driver.get("https://www.google.com");
		test.pass("Navigated through google.com");
		extent.createTest("MyFirstTest", "Test Description");
		test.log(Status.INFO,"This step shows usage of logs(status,details)");
		test.info("This step shows usage of info(details)");
		test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");

	}
	@AfterTest
	public void Teardowntest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed sucessfully");
	}
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}
}

package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException
	{
		ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter("extentReports.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
		ExtentTest test = extent.createTest("Google search Test-1","This is to validate google search functionality");
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chrome/chromedriver.exe");
		driver=new ChromeDriver();
		test.log(Status.INFO,"Starting Test case");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		test.pass("Navigated to google.com");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("iphone 13");
		test.pass("Entered text in searchbox");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.fail("Pressed enter key");
		driver.close();
		driver.quit();
		test.pass("Browser close successfully");
		test.info("Test completed");
		extent.flush();
	}
}

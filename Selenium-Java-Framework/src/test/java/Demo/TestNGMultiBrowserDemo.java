package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	
	WebDriver driver=null;
	String path=System.getProperty("user.dir");;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("Browser name is:= "+browserName);
		System.out.println("Thread id:= "+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", path+"/drivers/chrome/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", path+"/drivers/IE/msedgedriver.exe");
			driver=new EdgeDriver();
		}
	}
	
	@Test
	public void test1()
	{
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Test completed sucessfully");
	}

}

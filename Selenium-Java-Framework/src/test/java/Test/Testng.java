package Test;

import org.testng.annotations.Test;
import config.PropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Testng {

	WebDriver driver=null;
	public static String browserName=null;
	@BeforeTest
	public void setuptest()
	{
		String path=System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", path+"/drivers/chrome/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", path+"/drivers/IE/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}	
	}
	
	@Test
	public void googleSearch1() throws InterruptedException 
	{
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("oneplus 10 pro");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void Teardowntest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed sucessfully");
		PropertiesFile.setProperties();
	}

}

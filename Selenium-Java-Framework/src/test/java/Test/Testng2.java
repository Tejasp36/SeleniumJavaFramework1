package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Testng2 {

	WebDriver driver=null;
	@BeforeTest
	public void setuptest()
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chrome/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void googleSearch1() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("sneakers for men");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="googleSearch1")
	public void googleSearch2() throws InterruptedException 
	{
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("iphone 13");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	@Test(dependsOnMethods="googleSearch2")
	public void googleSearch3() throws InterruptedException 
	{
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Denim jackets");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void Teardowntest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed sucessfully");
	}
}

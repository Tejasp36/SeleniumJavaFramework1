package Test;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ObjectLocators.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		
		googleSearch();
	}
	public static void googleSearch() throws InterruptedException
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chrome/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
//		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("oneplus 10 pro");
//		Thread.sleep(1000);
//		driver.findElement(By.name("btnK")).click();
		GoogleSearchPage.textbox_search(driver).sendKeys("oneplus 10 pro");
		GoogleSearchPage.btn_search(driver).sendKeys(Keys.RETURN);
		System.out.println("Test completed sucessfully");
	}

}

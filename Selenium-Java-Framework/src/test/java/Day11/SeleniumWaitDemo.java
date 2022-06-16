package Day11;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.Main;

public class SeleniumWaitDemo 
{
	public static void main(String[] args)
	{
		SeleniumWaits();	
	}
   public static void SeleniumWaits()
   {
	    String path = System.getProperty("user.dir");
		   System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chrome\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.ebay.com");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //250ms is default waiting time for implicitly wait condition
		   driver.findElement(By.id("gh-ac")).sendKeys("Books");
		   driver.findElement(By.id("gh-btn")).click();
		  // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("ab"))); //explicit way
		   driver.findElement(By.name("abcd")).click();
		   driver.close();
		   driver.quit();
	}
	  
 }
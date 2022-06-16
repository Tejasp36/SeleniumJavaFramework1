import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BrowserTest {

	public static void main(String[] args) throws InterruptedException  {

		String path=System.getProperty("user.dir");
		System.out.println(path);

//CHROME
			System.setProperty("webdriver.chrome.driver", path+"/drivers/chrome/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("oneplus 10 pro");
			List<WebElement> list = driver.findElements(By.xpath("//input"));
			System.out.println(list.size());
			Thread.sleep(2000);
			driver.close();

//EDGE
			System.setProperty("webdriver.edge.driver", path+"/drivers/IE/msedgedriver.exe");
			WebDriver drivers=new EdgeDriver();
			drivers.manage().window().maximize();
			drivers.get("https://www.selenium.dev");
			Thread.sleep(3000);
			driver.close();
		
	}
}

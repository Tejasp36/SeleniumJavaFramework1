
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		
//CHROME
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
        driver.close();
    
//EDGE
//		  WebDriverManager.edgedriver().setup();
//          WebDriver driver=new EdgeDriver();
//          driver.manage().window().maximize();
//          driver.get("https://google.com");
//          Thread.sleep(3000);
//          driver.close();
		
	}
}

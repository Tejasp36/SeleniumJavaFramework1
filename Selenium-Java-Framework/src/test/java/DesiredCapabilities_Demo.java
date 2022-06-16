import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", path+"/drivers/IE/msedgedriver.exe");
		WebDriver drivers=new EdgeDriver();
		drivers.manage().window().maximize();
		drivers.get("https://www.google.com");
		drivers.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("oneplus 10 pro");
		Thread.sleep(1000);
		drivers.findElement(By.name("btnK")).click();
		drivers.close();
		drivers.quit();
	}

}

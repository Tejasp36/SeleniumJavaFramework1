package Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import ObjectLocators.GoogleSearchPageObjects;

public class GoogleSearchPageTest 
{
	private static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearchTest();
	}
	public static void googleSearchTest()
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chrome/chromedriver.exe");
		driver=new ChromeDriver();
		GoogleSearchPageObjects SearchPageObj=new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com");
		SearchPageObj.setTextInSearchBox("oneplus 10 pro");
		SearchPageObj.clickSearchButton();
		driver.close();
		driver.quit();
	}
}


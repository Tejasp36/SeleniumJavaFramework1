package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {

	WebDriver driver=null;
	
//	@BeforeTest
//	public void setuptest()
//	{
//			String path=System.getProperty("user.dir");
//			System.setProperty("webdriver.chrome.driver", path+"/drivers/chrome/chromedriver.exe");
//			driver=new ChromeDriver();	
//	}
	
	@Test(dataProvider="test1data")
	public void test1(String username,String password) throws InterruptedException
	{
		System.out.println(username+" | "+password);
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.findElement(By.id("txtUsername")).sendKeys(username);
//		driver.findElement(By.id("txtPassword")).sendKeys(password);
//		Thread.sleep(2000);
	}
	
	@DataProvider(name="test1data")
	public Object[][] getData()
	{
		String projectpath=System.getProperty("user.dir");
		String excelPath=projectpath+"/excel/Demo.xlsx";
		Object data[][]=testData(excelPath,"Sheet1");
		return data;
	}
	
	public static Object[][] testData(String excelPath,String sheetName)
	{
		ExcelUtil excel=new ExcelUtil(excelPath,sheetName);
		int rowCount=excel.getRowCount();
		int colCount=excel.getColCount();
		Object data[][]=new Object[rowCount][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String celldata=excel.getcellDataString(i, j);
				//System.out.println(celldata);
				data[i-1][j]=celldata;
			}
		}
		return data;

	}

}

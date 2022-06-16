package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.Testng;

public class PropertiesFile {

	private static String projectpath= System.getProperty("user.dir");
	private static Properties prop=new Properties();
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}
	public static void getProperties()
	{
		try {

			String projectpath= System.getProperty("user.dir");
			InputStream ip= new FileInputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
			prop.load(ip);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			Testng.browserName=browser;
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void setProperties()
	{
		try 
		{
			OutputStream os=new FileOutputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
			prop.setProperty("result", "pass");
			prop.store(os,null);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}

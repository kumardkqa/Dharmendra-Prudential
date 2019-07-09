package com.qa.util;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.*;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	
	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("D:\\workspace_Test\\learingBDD\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(file);	
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void intialization() {
		String browserName = prop.getProperty("Brower");
		
		
		if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Software\\IEDriverServer\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Software\\GeckoDdriver\\geckodriver.exe");
			driver = new FirefoxDriver();			
		}
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
	}
	
	public static void closeDriver() 
	{
		driver.close();
		driver.quit();
	}
	
}

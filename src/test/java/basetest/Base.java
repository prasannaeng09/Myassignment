package basetest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {
	public WebDriver driver;
	
	
	@BeforeMethod
	@Parameters({"browsername"})
	public WebDriver initializingbrowser(String browsername) throws IOException {
		
	
	//String browsername="chrome";
	
	if(browsername.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	
	}
	else if(browsername.equalsIgnoreCase("firefox"))
	{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	}
	else if(browsername.equalsIgnoreCase("edge"))
	{
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
}
	@BeforeMethod
	@Parameters({"url"})
	public void launchapp(String url)
	{
		driver.get(url);
	}
	
	@AfterMethod(alwaysRun =true )
	public void teardown() {
		driver.close();

	}
}
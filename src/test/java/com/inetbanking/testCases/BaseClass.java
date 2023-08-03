package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.w3c.dom.DOMConfiguration;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	
	
	// we will write common things 
	
	ReadConfig readconfig=new ReadConfig();    // object creation for read config java file
	public String baseURL=readconfig.geApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger Logger;
	
	@Parameters("browser")    // To run tc on desired browser from test ng.xml
	@BeforeClass
	public void setup( String br)
	{
		Logger=Logger.getLogger("ebanking");                  // import logger for apache
		DOMConfigurator.configure("log4j.xml");
		
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver=new ChromeDriver();
		}
		else if (br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		// implementing log 4j for logger
		
		
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	public String randomstring()
	{
		String geneartedstring=RandomStringUtils.randomAlphabetic(8);
		return (geneartedstring);
	}
	
}
	
	
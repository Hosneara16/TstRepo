package com.EbankingTestCase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.EbankingTestUtilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	ReadConfig rc = new ReadConfig();
	
	public String baseURL = rc.getBaseURL();
	public String userID = rc.getUserID();
	public String password = rc.getPassword();
	public String custName = rc.getcustName();
	public String mm = rc.getBirthmm();
	public String dd = rc.getBirthdd();
	public String yyyy = rc.getBirthY();
	public String custId = rc.getCustId();
	public String accountType = rc.getAcntType();
	
	public static WebDriver driver;
	public Logger logger;
	
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String br) {
		
		logger = Logger.getLogger("Baseclass");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(baseURL);
		logger.info("Application URL launched with "+ br);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
}

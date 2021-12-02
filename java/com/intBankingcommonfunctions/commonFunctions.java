package com.intBankingcommonfunctions;

import java.io.FileInputStream;

import java.io.IOException;

import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;

public class commonFunctions {
	
	public static WebDriver driver=null;
	public static Properties properties=null;
	ExtentReports extentReport;
	ExtentSparkReporter sparkReporter;
	ExtentTest testCase;
	
	Logger logger=Logger.getLogger(commonFunctions.class);
	public Properties loadProperty() throws IOException {
		
		FileInputStream fileInputStream=new FileInputStream("./Configurations//config.properties");
		properties=new Properties();
		properties.load(fileInputStream);
		return properties;
		
	
	}
	
	@BeforeSuite
	public void launchBrowser() throws IOException {
		
	    PropertyConfigurator.configure("log4j.properties");	
	    logger.info("InetBanking Test Begins");
	    logger.info("Load the property file");
		loadProperty();
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String chromeLocation=properties.getProperty("ChromeLocation");
		String firefoxLocation=properties.getProperty("FirfoxLocation");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromeLocation);
			driver=new ChromeDriver();
			logger.info("Lounching the Chrome browser");
		} else if(browser.equalsIgnoreCase("fireFox")){
			System.setProperty("webdriver.gecko.driver", firefoxLocation);
			driver=new FirefoxDriver();
			logger.info("Lounching the Firfox browser");
		}
		driver.manage().window().maximize();
		logger.info("Navigating to the application");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to(url);
	}
	
	
	@AfterSuite
	public void tearDown() {
		logger.info("Execution done. close the browser");
		
	}
	

}

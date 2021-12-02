package com.intBanking.TestCases;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.intBanking.PageObject.LoginPage;
import com.intBankingcommonfunctions.commonFunctions;

import junit.framework.TestCase;

public class TC_LoginPage extends commonFunctions {

	
	
static	String HomepagetitleName=null;
	static Logger logger = Logger.getLogger(TC_LoginPage.class);
	public void login() {
		logger.info("Login to the applicaton");
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.userName.sendKeys(properties.getProperty("username"));
		LoginPage.password.sendKeys(properties.getProperty("password"));
		LoginPage.submitButton.click();
		logger.info("After the logging to home and verify the title");
		HomepagetitleName =driver.getTitle();
		
		System.out.println(HomepagetitleName);
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}
	}
	
	
	
	@Test
	public void LoginPageTestCase() {
		
		login();
		logger.info("Login to the applicaton successfully");
		
	
		
	}
}

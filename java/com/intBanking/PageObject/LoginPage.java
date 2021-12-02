package com.intBanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intBankingcommonfunctions.commonFunctions;

public class LoginPage extends commonFunctions {

	@FindBy(name="uid")
	public static WebElement userName;

	@FindBy(name="password")
	public static WebElement password;

	@FindBy(name="btnLogin")
	public static WebElement submitButton;

	
	}
	


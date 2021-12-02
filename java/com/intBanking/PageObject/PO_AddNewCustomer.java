package com.intBanking.PageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intBankingcommonfunctions.commonFunctions;

public class PO_AddNewCustomer extends commonFunctions{

	@FindBy(linkText ="New Customer")
		public static WebElement NewCustomer;
	
	@FindBy(name="name")
	public static WebElement customerName;
	
	@FindBy(xpath ="//tr[5]//td[2]//input[2]")
	public static WebElement Gender;
	
	@FindBy(id ="dob")
	public static WebElement DateofBirth;
	
	@FindBy(name ="addr")
	public static WebElement Address;
	
	@FindBy(name ="city")
	public static WebElement City;
	
	@FindBy(name ="state")
	public static WebElement State;
	
	@FindBy(name ="pinno")
	public static WebElement PIN;
	
	@FindBy(name ="telephoneno")
	public static WebElement MobileNumber;
	
	@FindBy(name ="emailid")
	public static WebElement Email;
	
	@FindBy(name ="password")
	public static WebElement Password;
	
	@FindBy(name ="sub")
	public static WebElement submit;
	
	@FindBy(name ="res")
	public static WebElement reset;
}

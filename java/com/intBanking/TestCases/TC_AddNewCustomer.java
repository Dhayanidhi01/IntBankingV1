package com.intBanking.TestCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.intBanking.PageObject.PO_AddNewCustomer;
import com.intBankingcommonfunctions.commonFunctions;

public class TC_AddNewCustomer extends commonFunctions {

	public void addnewcustomersdetails() {
		
		PageFactory.initElements(driver, PO_AddNewCustomer.class);
		
		PO_AddNewCustomer.NewCustomer.click();
		PO_AddNewCustomer.customerName.sendKeys("Sivaji");
		PO_AddNewCustomer.Gender.click();
		PO_AddNewCustomer.DateofBirth.sendKeys("12/12/2021");
		PO_AddNewCustomer.Address.sendKeys("Sivaji, Chengham, Tiruvanmalai 635637");
	    PO_AddNewCustomer.City.sendKeys("Chennai");
	    PO_AddNewCustomer.State.sendKeys("Tamil nadu");
	    PO_AddNewCustomer.PIN.sendKeys("521421");
		PO_AddNewCustomer.MobileNumber.sendKeys("123456875");
		PO_AddNewCustomer.Email.sendKeys("sivaji@gmail.com");
		PO_AddNewCustomer.Password.sendKeys("D@122334");
		PO_AddNewCustomer.submit.click();
		
	}
	
	public void AlertBox() {	
		PageFactory.initElements(driver, PO_AddNewCustomer.class);
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
		driver.switchTo().alert().accept();
		
	}
	public void ClickReset() {
		PageFactory.initElements(driver, PO_AddNewCustomer.class);
		PO_AddNewCustomer.reset.click();
	}
	
	
	@Test
	public void tc_Addnewcustomers_002() {
		
		addnewcustomersdetails();
		AlertBox();
		ClickReset();
	}
	
}

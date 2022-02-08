package com.EbankingTestCase;

import org.testng.annotations.Test;

import com.EbankingPageObjects.EBankingObjectPage;

public class CreateNewAccount extends Baseclass {
	
	@Test
	public void createNewAccount() {
		
		EBankingObjectPage createNA = new EBankingObjectPage(driver);
		createNA.setUserID(userID);
		createNA.setPassword(password);
		createNA.clickLogIn();
		createNA.clickNewAccount();
		createNA.setCustomerId(custId);
		createNA.selectSavings(accountType);
	}
	
	
	
	

}

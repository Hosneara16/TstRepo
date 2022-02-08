package com.EbankingTestCase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EbankingPageObjects.EBankingObjectPage;

public class Login_Ebanking extends Baseclass{
	
	@Test
	public void login() {
		//driver.get(baseURL);
		
		EBankingObjectPage lp = new EBankingObjectPage(driver);
		
		lp.setUserID(userID);
		logger.info("User Id entered");
		
		lp.setPassword(password);
		logger.info("Password entered");
		
		lp.clickLogIn();
		logger.info("Clicked on Login button successfully");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Title is "+ driver.getTitle());
		}
		else {
			Assert.assertTrue(false);
		}
		
		
	}
	
	

}

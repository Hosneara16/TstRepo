package com.EbankingTestCase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.EbankingPageObjects.EBankingObjectPage;

public class AddNewCustomer extends Baseclass{
	
	@Test
	public void customerAdding() throws InterruptedException {
		
	EBankingObjectPage lp = new EBankingObjectPage(driver);
			
			lp.setUserID(userID);
			logger.info("User Id entered");
			
			lp.setPassword(password);
			logger.info("Password entered");
			
			lp.clickLogIn();
			logger.info("Clicked on Login button successfully");
			
			Thread.sleep(2000);
			
			if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
				Assert.assertTrue(true);
				logger.info("Title is "+ driver.getTitle());
			}
			else {
				Assert.assertTrue(false);
			}
			
			
			lp.clkNewCust();
			
		//	if(isAlertPresent()==true) {
			//	driver.switchTo().alert().accept();
			//}
			
			//if(clickOnAlert.) {
				//lp.clickOnAlert();
			//}
			//Thread.sleep(4000);
			
			if(adsHandler()==true) {
				adsHandler();
				Thread.sleep(2000);
			}
			
			lp.clickAds();
			
			
			lp.setCustomerName(custName);
			lp.selectGender();
			lp.addCustDob(mm, dd, yyyy);
		}
	
//	public boolean isAlertPresent() {
//		try {
//			driver.switchTo().alert();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}
//	}

	public boolean adsHandler() {
		String mainWinHandle = driver.getWindowHandle(); // Get your main window
		driver.switchTo().window(mainWinHandle);
		return true;
	}
}

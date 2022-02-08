package com.EbankingPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EBankingObjectPage {
	
	WebDriver ldriver;

	public EBankingObjectPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(name="uid")
	WebElement txtUserID;
	
	@FindBy(name="password")
	WebElement txtPassWord;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	public void setUserID(String userID) {
		txtUserID.sendKeys(userID);
	}
	
	public void setPassword(String password) {
		txtPassWord.sendKeys(password);
	}
	
	public void clickLogIn() {
		btnLogin.click();
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[5]/a")
	WebElement clickNewAccount;
	
	public void clickNewAccount() {
		clickNewAccount.click();	
	}
	
	@FindBy(name="cusid")
	WebElement txtcustomerId;
	
	public void setCustomerId(String custId) {
		txtcustomerId.sendKeys( custId);	
		
	}
	
	@FindBy(name="selaccount")
	WebElement ddAccountType;
	
	public void selectSavings(String accountType) {
		Select sel = new Select(ddAccountType);
		sel.selectByVisibleText(accountType);
	}
	
	@FindBy(name="inideposit")
	WebElement txtiniDeposit;
	
	public void setDeposit(String deposit) {
		txtiniDeposit.sendKeys(deposit);
	}
	

	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement clickNewCust;
	
	public void clkNewCust() {
		clickNewCust.click();
	}
	
	@FindBy(name="name")
	WebElement txtCustomerName;
	
	public void setCustomerName(String custName) {
		txtCustomerName.sendKeys(custName);	
	}
	
	@FindBy(name="rad1")
	WebElement btnGender;
	
	public void selectGender() {
		btnGender.click();
	}
	
	@FindBy(name="dob")
	WebElement custDob;
	
	public void addCustDob(String mm, String dd, String yyyy) {
		custDob.sendKeys(mm);
		custDob.sendKeys(dd);
		custDob.sendKeys(yyyy);
	}
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement btnLogOut;
	
	public void clickLogOut() {
		btnLogOut.click();
	}
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[3]/div/span")
	WebElement clickAlert;
	
	public boolean clickOnAlert() {
		clickAlert.click();
		return true;
	}
	
	@FindBy(xpath="/html/body/div/div/div[1]/div[1]/div/svg")
	WebElement clickAd;
	
	public void clickAds() {
		clickAd.click();
	}

}

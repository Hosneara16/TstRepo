package com.EbankingTestCase;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EbankingPageObjects.EBankingObjectPage;
import com.EbankingTestUtilities.XlUtils;

public class DDT_Demo extends Baseclass{
	
	@Test(dataProvider="LoginData")
	//@Test(dataProvider = "DemoLoginData")
	///public void ddt_Login(String uid, String pwd) throws InterruptedException {
	
	public void ddt_Login(String username, String pword) throws InterruptedException {
		EBankingObjectPage lp = new EBankingObjectPage(driver);
	
		lp.setUserID(username);
		logger.info("Entered User Name");
		
		lp.setPassword(pword);
		logger.info("Entered password");
		
		lp.clickLogIn();
		logger.info("Clicked on login burron");
		
		lp.clickLogOut();
		
		Thread.sleep(2000);
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
		}
		
		
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
			
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException{
		String xlPath = "./src/test/java/com/EbankingTestData/mili_test.xlsx";
		//String xlPath = System.getProperty("user.dir")+"/src/test/java/com/EbankingTestData/Demo.xlsx";	
		int  rownum = XlUtils.getRowCount(xlPath, "Sheet1");
		int colcount = XlUtils.getCellCount(xlPath, "Sheet1", 1);
		
		String loginData[][]=new String[rownum][colcount];
		
		for(int i=1; i<=rownum; i++) {
			for(int j=0; j<colcount; j++) {				
				loginData[i-1][j]=XlUtils.getCellData(xlPath, "Sheet1", i, j);
			}
		}
		return loginData;
	}
	
	
//	@DataProvider(name = "DemoLoginData")
//	String [] [] getData() throws IOException{
//		String xlFilePath = "./src/test/java/com/EbankingTestData/Demo.xlsx";
//		
//		int rowNum = XlUtils.getRowCount(xlFilePath, "Login");
//		int columnCount = XlUtils.getCellCount(xlFilePath, "Login", 1);
//		
//		String loginData [][] = new String [rowNum][columnCount];
//		
//		for(int i = 1; i<= rowNum; i++) {
//			for(int j = 0; j<columnCount; j++) {
//				loginData[i-1][j] = XlUtils.getCellData(xlFilePath, "Login", i, j);
//			}
//		}
//		return loginData;
//		
//	}
	

}

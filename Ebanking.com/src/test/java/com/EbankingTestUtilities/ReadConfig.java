package com.EbankingTestUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro = new Properties();

	public ReadConfig() {
		
		File src = new File("./Configuration/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			//pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
			
		}
		
	}

	public String getBaseURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserID() {
		String uid = pro.getProperty("userID");
		return uid;
	}
	
	public String getPassword() {
		String pwd = pro.getProperty("password");
		return pwd;
	}
	
	public String getcustName() {
		String cName = pro.getProperty("custName");
		return cName;
	}
	
	public String getBirthmm() {
		String birthm = pro.getProperty("mm");
		return birthm;
	}
	
	public String getBirthdd() {
		String birthd = pro.getProperty("dd");
		return birthd;
		
	}
	
	public String getBirthY() {
	String birthy = pro.getProperty("yyyy");
	return birthy;	
	}
	
	public String getCustId() {
		String custId = pro.getProperty("custId");
		return custId;
	}
	
	public String getAcntType() {
		String acntType=pro.getProperty("accountType");
		return acntType;
	}
	
//	public String getDeposit() {
//		String 
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.inetbanking.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_loginTest_001 extends BaseClass{
	
	
	@Test
	public void loginTest() {
		
		
		Logger.info("URL is opened");
		
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setusername(username);
		
		Logger.info("user name entered");
		lp.setpassword(password);
		
		Logger.info("pssword enterd");
		lp.clicksubmit();
		
		 //verifying
//		if(driver.getTitle().equals("Guru99 Bank Manager Home Page"))
//		{
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//		}
		
	}

}
  
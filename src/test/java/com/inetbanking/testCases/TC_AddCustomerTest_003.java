package com.inetbanking.testCases;

import static org.testng.Assert.assertTrue;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{

	
	// now we can use 2 page object classes
	
	@Test
	public void addnewcustomer() throws InterruptedException{
		// login test case we are using to login
		LoginPage lp=new LoginPage(driver);
		
		lp.setusername(username);
		
		Logger.info("user name entered");
		lp.setpassword(password);
		
		Logger.info("pssword enterd");
		
		
		lp.clicksubmit();
		
		
		Thread.sleep(2000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.clickaddnewcustomer();
		addcust.custname("Manoj");
		addcust.custgender();
		Thread.sleep(2000);
		addcust.custdob("10","25","1997");
		
		Thread.sleep(2000);
		addcust.custaddress("4 1st main bangalore");
		addcust.custcity("bangalore");
		addcust.custstate("karnataka");
		addcust.custpinno("560079");
		
		addcust.custtelephoneno("9036237093");
		
		String email =randomstring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("admin");
		Thread.sleep(3000);
		addcust.custsubmit();
		// email id should be unique every time so we should use random function so that each time it will generate a new email id
		
		// // add gmail.com to all the email id
		
		
		// we have to verify if the customer is added successfully 
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
}

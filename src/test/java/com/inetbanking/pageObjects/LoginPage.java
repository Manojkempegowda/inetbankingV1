package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
 //local driver    constructor
	
	 public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	// creating the elements
	@FindBy(name="uid")
	WebElement txtusername;

	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	// creating action methods below
	
    public void setusername(String uname)
    {
    	txtusername.sendKeys(uname);
    }
    public void setpassword(String pwd)
    {
    	txtpassword.sendKeys(pwd);
    }
    public void clicksubmit()
    {
    	btnLogin.click();
    }
    
}

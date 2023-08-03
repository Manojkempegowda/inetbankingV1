package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.testCases.BaseClass;

public class AddCustomerPage {
	
	 public AddCustomerPage(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
		}
	 
	 // for this tc let me use how 
	 
	 @FindBy(how = How.XPATH,using ="//a[contains(text(),'New Customer')]")
	 @CacheLookup
	 WebElement linkaddnewcustomer;
	 
	 @FindBy(how = How.XPATH,using="//input[@name='name']")
	 WebElement txtcutomername;
	 
	 @FindBy(how=How.NAME,using="rad1")
	 WebElement rgender;
	 
	 @FindBy(how=How.ID_OR_NAME, using="dob")
	 WebElement txtdob;
	 
	 @FindBy(how = How.XPATH, using="//textarea[@name='addr']")
	 WebElement txtaddress;
	 
	 @FindBy(how=How.XPATH, using ="//input[@name='city']")
	 WebElement txtcity;
	 
	 @FindBy(how = How.XPATH,using="//input[@name='state']")
	 WebElement txtstate;
	 
	 @FindBy(how = How.XPATH,using="//input[@name='pinno']")
	 WebElement txtpinno;
	 
	 @FindBy(how=How.XPATH,using="//input[@name='telephoneno']")
	 WebElement txttelephoneno;
	 
	 @FindBy(how = How.XPATH,using="//tbody/tr[12]/td[2]/input[1]")
	 WebElement txtemailid;
	 
	 @FindBy(how=How.XPATH,using="//input[@name='password']")
	 WebElement txtpassword;
	 
	 @FindBy(how=How.NAME,using="sub")
	 WebElement btnsub;
	 
	 // now for evry element we should write action method
	 
	 public void clickaddnewcustomer() {
		 linkaddnewcustomer.click();
	 }
	 
	 public void custname(String cname) {
		 txtcutomername.sendKeys(cname);
	 }
	 
	 public void custgender() {
		 rgender.click();
	 }
	 
	 public void custdob(String mm, String dd, String yy) {
		 txtdob.sendKeys(mm);
		 txtdob.sendKeys(dd);
		 txtdob.sendKeys(yy);
	 }
	 public void custaddress(String caddress)
	 {
		 txtaddress.sendKeys(caddress);
	 }
	 public void custcity(String ccity)
	 {
		 txtcity.sendKeys(ccity);
	 }
	 public void custstate(String cstate)
	 {
		 txtstate.sendKeys(cstate);
	 }
	 public void custpinno(String cpinno)     // senkeys will only accept char not int we need to send dtring
	 {
		 txtpinno.sendKeys(String.valueOf(cpinno));
	 }
	 
	 public void custemailid(String cemailid)
	 {
		 txtemailid.sendKeys(cemailid);
	 }
	 public void custtelephoneno(String ctelephoneno)
	 
	 {
		 txttelephoneno.sendKeys(ctelephoneno);
	 }
	 public void custpassword(String cpassword)
	 {
		 txtpassword.sendKeys(cpassword);
	 }
	 public void custsubmit() {
		 btnsub.click();
	 }
}

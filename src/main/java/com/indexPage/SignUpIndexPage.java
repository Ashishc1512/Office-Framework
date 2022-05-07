package com.indexPage;

/*Code changes

We have know

We don't know how we can take it forward.

and we have to do show.

Now we are done ad let me know once you are dread f

what we ned tro wnhwfjwbnfdnjnfwjnf bfwbfus

We are checking the 

How we need to check that we are working fine now.

now what is the problem out of it and we are defining the problem.
*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.init.AbstractPage;
import com.init.Common;
import com.verificationPage.LoginVerificationPage;
import com.verificationPage.SignUpVerificationPage;

public class SignUpIndexPage extends AbstractPage {
	
	public SignUpIndexPage(WebDriver driver) {
		
		super(driver);
		// TODO Auto-generated constructor stub
	} 

	@FindBy(xpath="//*[contains(text(),\"Register now!\")]")
	WebElement Register_email;	
	public SignUpVerificationPage  ClickResgiterNow()
	{
		Common.clickOn(driver, Register_email);
		return new SignUpVerificationPage(driver) ;
		
	}
	
	@FindBy(id = "login-email")
	WebElement input_email;	
	public SignUpVerificationPage enterEmail(String email) {
		
		Common.enterDataIn(driver, input_email, email);
		return new SignUpVerificationPage(driver);
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Get_started;	
	public SignUpVerificationPage ClickGetStarted() {
		
		Common.clickOn(driver, Get_started);
		return new SignUpVerificationPage(driver);
	}
	
	@FindBy(xpath = "//*[@src=\"/static/media/uk.4dcc5075.jpg\"]")
	WebElement Gbp_currency;	
	public SignUpVerificationPage ClickGBPcurrency() {
		
		Common.clickOn(driver, Gbp_currency);
		return new SignUpVerificationPage(driver);
	}
	
	@FindBy(xpath = "//*[contains(text(),\"Completely free! Register now without a credit card\")]")
	WebElement select_free;	
	public SignUpVerificationPage Clickfreeplan() {
		
		Common.clickOn(driver, select_free);
		return new SignUpVerificationPage(driver);
	}
	
	@FindBy(xpath = "//*[contains(text(), \"Continue\")]")
	WebElement click_continue;	
	public SignUpVerificationPage ClickContinue() {
		
		Common.clickOn(driver, click_continue);
		return new SignUpVerificationPage(driver);
	}
	
	@FindBy(xpath = "//*[contains(text(), \"Continue\")]")
	WebElement scroll_continue;	
	public SignUpVerificationPage ScrollContinue() {
		
		Common.scrollToElement(driver, scroll_continue);
		return new SignUpVerificationPage(driver);
	}
	
	@FindBy(name = "name")
	WebElement input_firstname;	
	public SignUpVerificationPage Enterfirstname(String firstname) {
		
		Common.enterDataIn(driver, input_firstname, firstname);
		return new SignUpVerificationPage(driver);
	}
	
	@FindBy(name = "companyName")
	WebElement input_companyname;	
	public SignUpVerificationPage Entercompanyname(String companyName) {
		
		Common.enterDataIn(driver, input_companyname, companyName);
		return new SignUpVerificationPage(driver);
	}
	
	@FindBy(name = "password")
	WebElement input_pwd;	
	public SignUpVerificationPage EnterpWd(String password) {
		
		Common.enterDataIn(driver, input_pwd, password);
		return new SignUpVerificationPage(driver);
	}
	
	@FindBy(name = "confirmPassword")
	WebElement input_confirmpwd;	
	public SignUpVerificationPage EnterConfirmpWd(String Confirmpassword) {
		
		Common.enterDataIn(driver, input_confirmpwd, Confirmpassword);
		return new SignUpVerificationPage(driver);
	}
	
	@FindBy(xpath = "//*[contains(text(),\"Create Account\")]")
	WebElement Click_CreateAccount;	
	public SignUpVerificationPage createAccount() {
		
		Common.clickOn(driver, Click_CreateAccount);
		return new SignUpVerificationPage(driver);
	}

}

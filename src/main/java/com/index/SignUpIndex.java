package com.index;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.init.Common;
import com.init.SeleniumInit;
import com.relevantcodes.extentreports.LogStatus;


public class SignUpIndex extends SeleniumInit {
	 
		int stepCount = 1;
		int extentStepCount =1;
		
	@Test
	public void InvalidEmail() throws Exception
	{
		System.out.println("Invalid email is:" + Common.getCellValue("SignUp",1,0));
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Click on Register now button");
		signupVerificationPage = signupindesPage.ClickResgiterNow();
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Enter invalid email address.");
		signupVerificationPage = signupindesPage.enterEmail(Common.getCellValue("SignUp",1,0));
		Thread.sleep(3000);
		
		testStepsLog("Step " + (stepCount++) + " : Verify incorrect email validation message.");
		boolean incorrectmeial= signupVerificationPage.verifyInvalidEmail();
		Assert.assertTrue(incorrectmeial,"Verify incorrect email validation message.");
	}
	
	@Test
	public void EmailExist() throws InterruptedException {
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Click on Register now button");
		signupVerificationPage = signupindesPage.ClickResgiterNow();
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Enter exist email address.");
		signupVerificationPage = signupindesPage.enterEmail(Common.getCellValue("SignUp",1,1));
		Thread.sleep(2000);
		
		testStepsLog("Step " + (stepCount++) + " : Verify exist email validation message.");
		boolean incorrectmeial= signupVerificationPage.VerifyEmailExist();
		Assert.assertTrue(incorrectmeial,"Verify exist email validation message.");
		Thread.sleep(2000);
	}
	
	@Test
	public void SucessfullySignUp() throws InterruptedException	{
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Click on Register now button");
		signupVerificationPage = signupindesPage.ClickResgiterNow();
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Enter exist email address.");
		signupVerificationPage = signupindesPage.enterEmail(Common.getCellValue("SignUp",1,2));
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Click on Get started button");
		signupVerificationPage = signupindesPage.ClickGetStarted();
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Select the GBP currency");
		signupVerificationPage = signupindesPage.ClickGBPcurrency();
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Select the free plan");
		signupVerificationPage = signupindesPage.Clickfreeplan();
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Scroll the page till continue button");
		signupVerificationPage = signupindesPage.ScrollContinue();
		Thread.sleep(2000);
		
		
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Click on continue button");
		signupVerificationPage = signupindesPage.ClickContinue();
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Enter first name");
		signupVerificationPage = signupindesPage.Enterfirstname(Common.getCellValue("SignUp",1,3));
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Enter company name");
		signupVerificationPage = signupindesPage.Entercompanyname(Common.getCellValue("SignUp",1,4));
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Scroll the page till continue button");
		signupVerificationPage = signupindesPage.ScrollContinue();
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Enter the password");
		signupVerificationPage = signupindesPage.EnterpWd(Common.getCellValue("SignUp",1,5));
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Enter confirm password");
		signupVerificationPage = signupindesPage.EnterConfirmpWd(Common.getCellValue("SignUp",1,6));
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Enter on continue button");
		signupVerificationPage = signupindesPage.ClickContinue();
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Step " + (extentStepCount++) + " : Click on create account button");
		signupVerificationPage = signupindesPage.createAccount();
		Thread.sleep(2000);
		
		testStepsLog("Step " + (stepCount++) + " : Verify 'Accout created sucessfully'validation message.");
		boolean incorrectmeial= signupVerificationPage.SucessfullySignup();
		Assert.assertTrue(incorrectmeial,"Verify 'Accout created sucessfully'validation message.");
		Thread.sleep(2000);
		
	}
	
}

package com.verificationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.errorprone.annotations.Var;
import com.init.AbstractPage;
import com.init.Common;
import com.relevantcodes.extentreports.LogStatus;


public class SignUpVerificationPage extends AbstractPage{
Boolean bool;
	public SignUpVerificationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean verifyInvalidEmail() {
		
		Common.pause(2);
		WebElement email = driver.findElement(By.xpath("//*[text()='Please enter a valid email address']"));
		if(null!=email && email.isDisplayed()){
		test.log(LogStatus.PASS, "Verified validation message");
		bool=true;
		}else {
			test.log(LogStatus.FAIL,"Not verified");
			bool=false;
		}
		return bool;
	}

	public boolean VerifyEmailExist() {
		
		Common.pause(2);
		WebElement existemail = driver.findElement(By.xpath("//*[text()='Email already exist']"));
		if(null!=existemail && existemail.isDisplayed()){
		test.log(LogStatus.PASS, "Verify email already exist validation message");
		bool=true;
		}else {
			test.log(LogStatus.FAIL,"Email exist");
			bool=false;
		}
		return bool;
	}
	
	public boolean SucessfullySignup() {
		
		Common.pause(2);
		WebElement existemail = driver.findElement(By.xpath("//*[contains(text(),\"Account created successfully\")]"));
		if(null!=existemail && existemail.isDisplayed()){
		test.log(LogStatus.PASS, "Verify Account created sucessfully validation message");
		bool=true;
		}else {
			test.log(LogStatus.FAIL,"User enter incorrect email");
			bool=false;
		}
		return bool;
	}
	
}

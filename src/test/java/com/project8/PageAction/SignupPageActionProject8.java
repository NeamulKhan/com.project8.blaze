package com.project8.PageAction;

import org.testng.Assert;

import com.project8.PageLocator.SignupPageLocatorProject8;

import utilityProject8.BaseClassProject8;

public class SignupPageActionProject8 extends BaseClassProject8{
	
	SignupPageLocatorProject8 signupPageLocatorProject8 = new SignupPageLocatorProject8();
	
	public void enterCredentials(String x,String y) throws Exception {
		
	
		signupPageLocatorProject8.Username.sendKeys(x);
		signupPageLocatorProject8.Password.sendKeys(y);
		signupPageLocatorProject8.SignupButton.click();
			
	}
	
	public void verifyAccountCreated() throws Exception {
		Thread.sleep(5000);
		
		boolean verifyaccount = signupPageLocatorProject8.verifySignup.isDisplayed();
		Assert.assertTrue(verifyaccount);
		
	}
	
	
	}
	
	
	



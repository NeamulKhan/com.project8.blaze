package com.project8.PageAction;


import org.testng.Assert;

import com.project8.PageLocator.HomepageLocatorProject8;
import com.project8.PageLocator.SignupPageLocatorProject8;

import utilityProject8.BaseClassProject8;

public class HomepageActionProject8 extends BaseClassProject8{
	
	HomepageLocatorProject8 homePage = new HomepageLocatorProject8();
	
	 public void signupLink() throws Exception {
		 
		 homePage.SignupLink.click();
		 
		 Thread.sleep(5000);
	 }

			
		public void verifySignupPage() throws Exception {
			
	Thread.sleep(5000);
			
			boolean verifysignupPage = homePage.signupPage.isDisplayed();
			
			Assert.assertTrue(verifysignupPage);
			
		}
		}
		


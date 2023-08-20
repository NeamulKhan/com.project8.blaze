package com.project8.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityProject8.BaseClassProject8;

public class SignupPageLocatorProject8 extends BaseClassProject8 {
	
	
	public SignupPageLocatorProject8() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="sign-username")
	
	public WebElement Username;
	
	@FindBy(id="sign-password")
	
	public WebElement Password;
	
	@FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	
	public WebElement SignupButton;
	
	@FindBy(id="signInModal")
	
	public WebElement verifySignup;
	
}




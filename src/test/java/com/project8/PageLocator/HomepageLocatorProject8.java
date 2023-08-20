package com.project8.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityProject8.BaseClassProject8;

public class HomepageLocatorProject8 extends BaseClassProject8{
	
public HomepageLocatorProject8() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="signin2")
	
	public WebElement SignupLink;
	
	@FindBy(xpath="//*[@id=\"signInModal\"]/div/div")
	
	public WebElement signupPage;
	

}

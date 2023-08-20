package stepDefinationProject8;

import com.project8.PageAction.HomepageActionProject8;
import com.project8.PageAction.SignupPageActionProject8;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilityProject8.BaseClassProject8;
import utilityProject8.UtilityProject8;

public class Signup_Project8 extends BaseClassProject8 {
	
	HomepageActionProject8 homepageActionProject8 = new HomepageActionProject8();
	SignupPageActionProject8 signupPageActionProject8 = new SignupPageActionProject8();
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	    
		launchURL(URL);

}
	
	@Then("^click signup link$")
	public void click_signup_link() throws Throwable {
	   
		homepageActionProject8.signupLink();
		
	}
	
	@Then("^verify user can see sign up page$")
	public void verify_user_can_see_sign_up_page() throws Throwable {
	    
		homepageActionProject8.verifySignupPage();
		UtilityProject8.takeMyScreenshot(driver, "Signup page");
		
	}
	
	@Then("^enter username and password and click sign up button$")
	public void enter_username_and_password_and_click_sign_up_button() throws Throwable {
	   
		signupPageActionProject8.enterCredentials(project8_prop.getProperty("Username"),project8_prop.getProperty("Password"));
	}

	@Then("^verify user can successfully create account$")
	public void verify_user_can_successfully_create_account() throws Throwable {
	    
		signupPageActionProject8.verifyAccountCreated();
		UtilityProject8.takeMyScreenshot(driver, "Account Created msg");
	}


}
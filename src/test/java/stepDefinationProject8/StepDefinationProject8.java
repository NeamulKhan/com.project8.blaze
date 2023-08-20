package stepDefinationProject8;

import cucumber.api.java.en.Given;
import utilityProject8.BaseClassProject8;

public class StepDefinationProject8 extends BaseClassProject8 {
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	    
		launchURL(URL);

}
}
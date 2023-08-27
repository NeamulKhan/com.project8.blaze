package testRunnerProject8;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utilityProject8.BaseClassProject8;


@CucumberOptions(features = {"/src/test/resources/featureFolderProject8 "}, //copy and paste of feature folder
plugin = {"json:target/cucumber.json"},
glue ="stepDefinationProject8", tags= {"@Login8"} //@Signup8,paste stepDefination package name
)


public class TestRunnerProject8 extends AbstractTestNGCucumberTests {
	
	
	
	@BeforeTest
	
	public void project8setup() throws Exception {
		
		BaseClassProject8 test = new BaseClassProject8();
		
		
		test.project8browserinit();
	}
	
	@AfterTest
	
	public void project8ClosureURL() {
	
		BaseClassProject8 test = new BaseClassProject8();
		
		//test.driver.quit();
	}


}




package utilityProject8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClassProject8 {

public static Properties project8_prop;
	
	public static WebDriver driver;
	
	public BaseClassProject8() {
		
		try {
			FileInputStream files = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\project8\\blaze\\config\\com.project8.blaze.Properties " );
			
			project8_prop = new Properties();
			
			project8_prop.load(files);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
public void project8browserinit() {
		
		String project8browser = project8_prop.getProperty("Browser1");
		
		if (project8browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\webDriverProject8\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestDataProject8.implicitywait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestDataProject8.pageLoadwait));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
						
		}
		
		else if (project8browser.equalsIgnoreCase("FireFox")) {
			
		}
		
	}
	
	public void launchURL(String URL) {
		
		driver.get(project8_prop.getProperty("URL"));
		
	}
	}



	
	


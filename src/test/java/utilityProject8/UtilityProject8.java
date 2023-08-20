package utilityProject8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityProject8 {
	
	public static void takeMyScreenshot(WebDriver driver, String screenshot) {
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String correntdir = System.getProperty("user.dir");
		try {
		FileUtils.copyFile(srcfile, new File(correntdir+"/screenShotProject8/"+screenshot+".png")); //copy and paste screenshot folder name
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		}



}

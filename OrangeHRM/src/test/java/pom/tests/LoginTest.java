package pom.tests;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;





public class LoginTest {
	
	@Test
	public static void validLogin() throws IOException
	{
		//launch browser
		pom.common.CommonMethod.launchBrowser();
		
		//launch webpage
		pom.configuration.Driver.driver.get(pom.configuration.Config.url);
		
		//implicite wait
		pom.configuration.Driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		System.out.println("Browser launch ");
		//read data --call readCsvFile()
		
		String[] data=pom.common.CommonMethod.readCsvFile(pom.configuration.Config.filepath);
		
		//login process
		
		pom.pages.LoginPage.getUsername().sendKeys(data[0]); //Admin
		pom.pages.LoginPage.getPassword().sendKeys(data[1]); //admin123
		pom.pages.LoginPage.getLoginbtn().click();
	}

}

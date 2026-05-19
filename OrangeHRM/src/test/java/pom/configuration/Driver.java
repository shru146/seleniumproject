package pom.configuration;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Driver {

	
public static WebDriver driver;
	
	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//pom.tests.LoginTest.validLogin();
	}
	*/
	@Test
	public void runTest() throws IOException
	{
		pom.tests.LoginTest.validLogin();
	}	
	
}


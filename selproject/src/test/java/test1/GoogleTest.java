package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void verifyTitle() throws InterruptedException
	{
	
	System.out.println("launching a chrome browser  ");
	
	
	//Test 1 -- Launch chrome browser 
	WebDriver driver = new ChromeDriver();
	

	//website launch 
	
	driver.get("https://www.google.com/");
	
	//to maximize window size 
	driver.manage().window().maximize();
	
	//get the title of the webpage 
	String title = driver.getTitle();
	System.out.println("Tittle of the page is ---> " +title );
	
	
	//wait for 5 sec then close browser 
	Thread.sleep(5000);
	
	//to close browser 
	driver.close();
	}
}

package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDDF {
	
	WebDriver driver;
	@Given("iven browser page is open")
	public void iven_browser_page_is_open()
	{
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@Given("application url is accessed")
	public void application_url_is_accessed() 
	{
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter their username as {string}")
	public void user_enter_their_username_as(String string) 
	{
	    driver.findElement(By.name("username")).sendKeys("un");
	}

	@When("user enter their password as {string}")
	public void user_enter_their_password_as(String string) 
	{
	    driver.findElement(By.name("password")).sendKeys("pw");
	}

	@When("user click on login button")
	public void user_click_on_login_button() 
	{
		driver.findElement(By.className("oxd-button")).click();
	   
	}

	@Then("each user dashboard is visible")
	public void each_user_dashboard_is_visible() throws InterruptedException
	{
		Thread.sleep(5000);
		   boolean   res=  driver.getPageSource().contains("Skills");
		   
		   if(res)
				System.out.println("Test passed .....skill added successfully");
			else
				System.out.println("Test failed....skill not added");
		}
	
	
		@After(order =2)
		public void logout() throws InterruptedException 
		{
			Thread.sleep(5000);
			driver.findElement(By.className("oxd-userdropdown-img")).click();
			driver.findElement(By.linkText("Logout")).click();
		}
		
		@After(order = 1)
		public void closeBrowser() 
		{
			driver.close();
		
		
		
	   
	}



}

package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	 @Given("Browser chrome is launched")
	public void browser_chrome_is_launched() 
	{
	   driver= new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("orange hrm url is launched")
	public void orange_hrm_url_is_launched() 
	{
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	}

	@When("admin enters their username")
	public void admin_enters_their_username() 
	{
	   driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@When("admin enters their password")
	public void admin_enters_their_password() 
	{
	   driver.findElement(By.name("password")).sendKeys("admin123"); 
	}

	@When("click on login")
	public void click_on_login() 
	{
	  driver.findElement(By.className("oxd-button")).click();
	}

	@Then("admin dashboard should be visible")
	public void admin_dashboard_should_be_visible() 
	{
		boolean res=driver.getPageSource().contains("Dashboard");
		if(res)
			System.out.println("Test passed .....Dashboard visible");
		else
			System.out.println("Test failed....Dashboard not visible");
	}

	@Then("admin is able to logout from the application")
	public void admin_is_able_to_logout_from_the_application() 
	{
		
		driver.findElement(By.className("oxd-userdropdown-img")).click();
		driver.findElement(By.linkText("Logout")).click();
	}


}

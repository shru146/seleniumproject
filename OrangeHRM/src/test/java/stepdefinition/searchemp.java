package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchemp{
	WebDriver driver;
	@Before(order=1)
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@Before(order=2)
	public void login()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		
	}
	@Given("Navigate PIM page")
	public void navigate_pim_page() {
	   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	}

	@When("enter a employee name")
	public void enter_a_employee_name() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).click();
	   driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("shruti");
	}

	@When("click on search button")
	public void click_on_search_button() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("employee is details should be displayed")
	public void employee_is_details_should_be_displayed() throws InterruptedException
	{
		
		Thread.sleep(5000);
	 //boolean res = driver.getPageSource().contains("shtuti");
		
		
	String name=	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div/div[2]")).getText();
	 if(name.equals("shruti"))
	      System.out.println("test pass--- employee search successfully");
	 else 
		  System.out.println("Test failed --- employee not found");
	 
	 
	}

	@After(order=2)
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.className("oxd-userdropdown-img")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
	}
	@After(order=1)
	public void closeBrowser()
	{
		driver.close();
	}
}

	

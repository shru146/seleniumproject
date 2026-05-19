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

public class Addemp {
	WebDriver driver;
//	@Before(order=1)
//	public void openBrower()
//	{
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	}
	
//	@Before(order=2)
//	public void login()
//	{
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.className("oxd-button")).click();
//		
//	}
	

	@Given("PIM page is open")
	public void add_employee_page_is_open() throws InterruptedException
	{
	  Thread.sleep(5000);
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");

	}
	@When("click on add employee button")
	public void admin_click_on_add_employee_button() 
	{
	   driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	}
	@When("enter first name and last name")
	public void enter_first_name_and_last_name()
	{
	   driver.findElement(By.name("firstName")).sendKeys("shruti");
	   driver.findElement(By.name("lastName")).sendKeys("phulari");
	  driver.findElement(By.className("oxd-input")).sendKeys("0479");
	}

	@When("Click on save button")
	public void click_on_save_button() throws InterruptedException
	{
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("employee should be add successfully")
	public void employee_should_be_add_successfully() throws InterruptedException
	{
	    Thread.sleep(5000);
	   boolean res= driver.getPageSource().contains("Add Employee");
	    
	    if(res)
	    	System.out.println("Test pass... employee added successfully");
	    
	    else 
	    	System.out.println("Test failed ... employee not added successfully");
	    
	}
	
//	@After(order=2)
//	public void logout() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		driver.findElement(By.className("oxd-userdropdown-img")).click();
//		driver.findElement(By.linkText("Logout")).click();
//		
//	}
//	
//	@After(order=1)
//	public void closeBrowser() 
//	{
//	  driver.close();
//	  
//	}


}

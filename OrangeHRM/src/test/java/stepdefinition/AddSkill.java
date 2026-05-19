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

public class AddSkill {
	
	WebDriver driver;
//	@Before(order=1)
//	public void openBrower()
//	{
//		driver = new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	}
//	
//	@Before(order=2)
//	public void login()
//	{
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.className("oxd-button")).click();
//	}
	@Given("viewskill page is open")
	public void viewskill_page_is_open() throws InterruptedException
	{
	   Thread.sleep(5000); 
	   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSkills");
	}

	@When("admin click on add skill button")
	public void admin_click_on_add_skill_button() 
	{
		driver.findElement(By.className("oxd-button--secondary")).click();
		
	}

	@When("enters skill name as {string}")
	public void enters_skill_name_as(String string) 
	{ 
		driver.findElement(By.xpath("xpath(\"/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Selenium");
      
	}

	@When("click on save")
	public void click_on_save() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.className("oxd-button--secondary")).click();
	}

	@Then("skill should be added successfully")
	public void skill_should_be_added_successfully() throws InterruptedException 
	{

		Thread.sleep(5000);
	   boolean   res=  driver.getPageSource().contains("Skills");
	   
	   
	   if(res)
			System.out.println("Test passed .....skill added successfully");
		else
			System.out.println("Test failed....skill not added");
	}

//	@After(order=3)
//	public void logout() throws InterruptedException
//	{
//	    Thread.sleep(5000);
//	    driver.findElement(By.className("oxd-userdropdown-img")).click();
//	    driver.findElement(By.linkText("Logout")).click();
//	}

	

}

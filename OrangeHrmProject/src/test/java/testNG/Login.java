package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Login {

	    WebDriver driver;

	    @BeforeClass
	    public void login() throws InterruptedException{

	  //  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


	        driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.manage().timeouts()
	              .implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        
	        System.out.println("Browser is launched successfully");

	        // Login
	        driver.findElement(By.name("username")).sendKeys("Admin");

	        driver.findElement(By.name("password")).sendKeys("admin123");

	        driver.findElement(By.className("oxd-button")).click();
	        System.out.println("login the page ");
	        
	        Thread.sleep(5000);
	        
	      
	    }

	    // Add Employee
	    @Test(priority = 1)
	    public void addEmployee() throws InterruptedException {
	    	
	  //  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	      
              driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	        driver.findElement(By.xpath("//a[text()='Add Employee']")).click();

	        driver.findElement(By.name("firstName")).sendKeys("Shruti");

	        driver.findElement(By.name("lastName")).sendKeys("phulari");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        System.out.println("employee add successfully");
            
	        Thread.sleep(5000);
	       
	    }

	    // Search Employee
	    @Test(priority = 2)
	    public void searchEmployee() throws InterruptedException  {
	    	
	    //	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    	

	       	       	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	        driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"))
	              .sendKeys("Shruti");

	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        System.out.println("search the employee ");
	       
	        Thread.sleep(5000); 
	    }

	    // Edit Employee
	    @Test(priority = 3)
	    public void editEmployee() throws InterruptedException  {
	    	 
	   // 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();

	        driver.findElement(By.name("middleName")).sendKeys("");

	        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

	        System.out.println("edit emaployee details");
	        Thread.sleep(5000);

	    }

	    // Delete Employee
	    @Test(priority = 4)
	    public void deleteEmployee() throws InterruptedException  {
	    	
	  //  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    	
            driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	       

            driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"))
            .sendKeys("Shruti");

            driver.findElement(By.xpath("//button[@type='submit']")).click();
	        driver.findElement(By.className("//button[normalize-space()='Yes, Delete']")).click();
	        
	        System.out.println("delete employee");
	        Thread.sleep(5000);   

	       
	    }

	    @AfterClass
	    public void tearDown() 
	   
	    {
	  //  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


	    	driver.findElement(By.className("oxd-userdropdown-img")).click();
			driver.findElement(By.linkText("Logout")).click();
	    	
	        driver.close();
	    }
	}
	



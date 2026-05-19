package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	//all ele from login page will locate

		public static WebElement username , password ,loginbtn;
		
		public static WebElement getUsername()
		{
			username=pom.configuration.Driver.driver.findElement(By.name("username"));
			return username;
			
		}
		
		public static WebElement getPassword()
		{
			password=pom.configuration.Driver.driver.findElement(By.name("password"));
			return password;
			
		}
		
		public static WebElement getLoginbtn()
		{
			loginbtn=pom.configuration.Driver.driver.findElement(By.className("oxd-button"));
			return loginbtn;
			
		}

}

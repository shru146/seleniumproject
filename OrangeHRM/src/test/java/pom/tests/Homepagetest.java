package pom.tests;

public class Homepagetest {
	
	public static boolean verifyDashboard() 
	{
	 boolean res =	pom.configuration.Driver.driver.getPageSource().contains("Dashboard");
		return res;
	}

}

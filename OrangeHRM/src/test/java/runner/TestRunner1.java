package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner1 {
	

	@CucumberOptions(features ="C:\\Users\\Shruti\\Documents\\Automation_\\OrangeHRM\\src\\test\\resources\\Features\\searchemp"	          
			, glue = {"stepdefinition"} , dryRun = false , monochrome = true)
	public class TestRunner  extends AbstractTestNGCucumberTests{

	}

}

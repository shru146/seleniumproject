package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(key = "cucumber.glue", value = "stepdefinition")

//report
@ConfigurationParameter(key = "cucumber.plugin", value =
       "pretty, html:target/cucumber-report.html, json:target/cucumber.json")
public class TestRunner2 {

}

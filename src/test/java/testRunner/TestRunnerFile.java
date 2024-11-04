package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/featurePackage/", glue = {"stepdefinitions"}, 
	    plugin = {
	        "pretty", 
	        "html:target/cucumber-html-report",
	        "json:target/cucumber.json",
	        "junit:target/cucumber.xml","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
	    monochrome = true, dryRun = false)
public class TestRunnerFile extends AbstractTestNGCucumberTests {

}

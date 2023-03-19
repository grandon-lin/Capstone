package Utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.relevantcodes.extentreports.ExtentReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepdefs.Hooks;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome = true,
		features = "src/test/java/features",
		glue = "stepdefs",
		plugin = {"pretty", "html:target/html-cucumber", "json:target/cucumber.json"},
		tags = {"@test or @sanity"}
)

public class TestRunner {
	
}

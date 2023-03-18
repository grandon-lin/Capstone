package Utils;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome = true,
		features = "src/test/java/features",
		glue = "stepdefs",
		plugin = {"pretty", "html:target/html-cucumber", "json:target/cucumber.json", "usage:target/cucumber-usage.json", "junit:target/cucumber-result.xml"},
		tags = {"@test or @sanity"}
)

public class TestRunner {

}

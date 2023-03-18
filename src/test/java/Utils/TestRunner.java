package Utils;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome = true,
		features = "src/test/java/features",
		glue = "stepdefs",
		tags = {"@test"}
)

public class TestRunner {

}

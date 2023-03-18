package stepdefs;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pages.HomePage;

public class APICallStepDef {

	WebDriver driver = Hooks.driver;
	HomePage homePage;
	
	Response response;
	RequestSpecification request;
	HashMap<String, String> products = new HashMap<String, String>();
	 
	public APICallStepDef() {
		homePage = new HomePage(driver);
		driver.get("http://localhost:8090/medicare/home");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	
	@Given("The base URI is {string}")
	public void the_base_URI_is(String URI) {
	    request = RestAssured.given().baseUri(URI);
	}

	@When("I perform the Get operation")
	public void i_perform_the_Get_operation() {
	    response = request.get();
	    
	    JsonPath jpath = response.jsonPath();
	   
	    List<String> names = jpath.get("name");
	    List<String> descriptions = jpath.get("description");
	    for(int i = 0; i < names.size(); i++) {
	    	products.put(names.get(i), descriptions.get(i));
	    	System.out.println(names.get(i) + ": " + descriptions.get(i));
	    }
	}

	@Then("Response code should be {int}")
	public void response_code_should_be(int expResponseCode) {
	    Assert.assertEquals(expResponseCode, response.getStatusCode());
	}

	@Then("UI displays the corresponding products")
	public void ui_displays_the_corresponding_products() {
		String prodItemXpath = "//div[@ng-repeat='product in pCtrl.mvProducts']";
	    List<WebElement> mostViewMedicinesNames = driver.findElements(By.xpath(prodItemXpath + "//h5"));
	    List<WebElement> mostViewMedicinesDescriptions = driver.findElements(By.xpath(prodItemXpath + "//p"));
	    for (int i = 0; i < mostViewMedicinesNames.size(); i++) {
	    	String name = mostViewMedicinesNames.get(i).getText();
	    	String description = mostViewMedicinesDescriptions.get(i).getText();
			Assert.assertEquals(products.get(name), description);
		}
	}
}

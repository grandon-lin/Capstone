package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDef {

	WebDriver driver = Hooks.driver;
	LoginPage loginPage;
	
	public LoginStepDef() {
		loginPage = new LoginPage(driver);
	}
	
	@Given("I have navigated to the login page")
	public void i_have_navigated_to_the_login_page() {
		driver.get("http://localhost:8090/medicare/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}

	@When("I enter the correct email as {string} and password as {string}")
	public void i_enter_the_correct_email_as_and_password(String emailVal, String passwordVal) {
	    loginPage.enterUsername(emailVal);
	    loginPage.enterPassword(passwordVal);
	}
	
	@Then("I click on the Login button")
	public void i_click_on_the_Login_button() {
	    loginPage.login();
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	    loginPage.verifyLogin();
	}

	@Then("I should not see Manage Products")
	public void i_should_not_see_Manage_Products() {
	    loginPage.manageProductIsNotDisplayed();
	}

	@Then("I should see Manage Products")
	public void i_should_see_Manage_Products() {
	    loginPage.manageProductIsDisplayed();
	}
}

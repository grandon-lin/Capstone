package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.SignupPage;

public class SignupStepDef {
	
	WebDriver driver = Hooks.driver;
	SignupPage signupPage;
	LoginPage loginPage;
	
	public SignupStepDef() {
		Hooks.testName = "Sign Up Test";
		signupPage = new SignupPage(driver);
	}
	
	@Given("I have navigated to the Sign Up page")
	public void i_have_navigated_to_the_Sign_Up_page() {
		driver.get("http://localhost:8080/medicare/membership");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	@When("I enter all the personal information as a user")
	public void i_enter_all_the_personal_information_as_a_user() {
	    signupPage.fillPersonalDataAsUser("Mediuser17", "Tester", "mediuser17.tester@gmail.com", "2476937459", "Abc123", "Abc123");
	}
	

	@When("I enter all the personal information as a supplier")
	public void i_enter_all_the_personal_information_as_a_supplier() {
	    signupPage.fillPersonalDataAsAdmin("Mediadmin17", "Suppliertester", "mediadmin17.suppliertester@gmail.com", "4729532825", "Xyz123", "Xyz123");
	}

	@When("I click on Next-Billing button")
	public void i_click_on_Next_Billing_button() {
	    signupPage.clickNextBilling();
	}

	@Then("I should land on Sign Up - Address page")
	public void i_should_land_on_Sign_Up_Address_page() {
	    signupPage.isSignUpPersonal();
	}

	@Then("I enter all the address information")
	public void i_enter_all_the_address_information() {
	    signupPage.fillAddressData("26", "Test Road", "Phoenix", "35326", "Arizona", "United State");
	}

	@Then("I click on Next-Confirm button")
	public void i_click_on_Next_Confirm_button() {
	    signupPage.clickNextConfirm();
	}

	@Then("I should land on the confirmation page")
	public void i_should_land_on_the_confirmation_page() {
	    signupPage.isConfirmDisplayed();
	}

	@Then("I click on Confirm button")
	public void i_click_on_Confirm_button() {
	    signupPage.clickConfirm();
	}

	@Then("I should land on Welcome page")
	public void i_should_land_on_Welcome_page() {
	    signupPage.isWelcomeDisplayed();
	}

	@Then("I click on Login Here button")
	public void i_click_on_Login_Here_button() {
	    signupPage.clickLoginHere();
	}

	@Then("I should have landed on Login page")
	public void i_should_have_landed_on_Login_page() {
	    loginPage = new LoginPage(driver);
	    loginPage.isLoginPageDisplayed();
	}

	@Then("I enter the email and password")
	public void i_enter_the_email_and_password() {
		loginPage.enterUsername(signupPage.emailValue);
		loginPage.enterPassword(signupPage.passwordValue);
	}
	
	@Then("I click on Login button")
	public void i_click_on_Login_button() {
	    loginPage.login();
	}
	
	@Then("I land on the home page")
	public void i_land_on_home_page() {
		loginPage.verifyLogin();
	}
}

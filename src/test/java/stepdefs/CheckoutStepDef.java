package stepdefs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CategoryPage;
import pages.CheckoutAddressPage;
import pages.HomePage;
import pages.LoginPage;
import pages.OrderSummaryPage;
import pages.PaymentDetailsPage;
import pages.ProductPage;

public class CheckoutStepDef {

	WebDriver driver = Hooks.driver;
	LoginPage loginPage;
	HomePage homePage;
	CategoryPage categoryPage;
	ProductPage productPage;
	CartPage cartPage;
	CheckoutAddressPage checkoutAddressPage;
	PaymentDetailsPage paymentDetailsPage;
	OrderSummaryPage orderSummaryPage;
	
	public CheckoutStepDef() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		categoryPage = new CategoryPage(driver);
		productPage = new ProductPage(driver);
		cartPage = new CartPage(driver);
		checkoutAddressPage = new CheckoutAddressPage(driver);
		paymentDetailsPage = new PaymentDetailsPage(driver);
		orderSummaryPage = new OrderSummaryPage(driver);
	}
	
	@Given("I login as a user")
	public void i_login_as_a_user() {
		driver.get("http://localhost:8090/medicare/login");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	    loginPage.enterUsername("mediuser.tester@gmail.com");
	    loginPage.enterPassword("Abc123");
	    loginPage.login();
	    try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@When("I select a category as {string}")
	public void i_select_a_category_as(String category) {
	    homePage.selectCategory(category);
	    try 
		{
			Thread.sleep(5000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("I should land on the category page for {string}")
	public void i_should_land_on_the_category_page(String category) {
	    categoryPage.checkProperCategoryDisplayed(category);
	}

	@Then("I click on the view button for a product as {string}")
	public void i_click_on_the_view_button_for_a_product_as(String product) {
	    categoryPage.selectViewProductButtonForProduct(product);
	    try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("I should land on the product details page for {string}")
	public void i_should_land_on_the_product_details_page(String product) {
	    productPage.checkCorrectProductDisplayed(product);
	}

	@Then("I click on the Add to Cart button")
	public void i_click_on_the_Add_to_Cart_button() {
	    productPage.addToCart();
	    try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("I should land on the shopping cart page and display item for {string}")
	public void i_should_land_on_the_shopping_cart_page(String product) {
	    cartPage.checkCartPageDisplaysProduct(product);
	}

	@Then("I click on Checkout button")
	public void i_click_on_Checkout_button() {
	    cartPage.checkout();
	    try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("I should land on Select Shipping Address page")
	public void i_should_land_on_Select_Shipping_Address_page() {
		checkoutAddressPage.checkSelectAddressDisplayed();
	}

	@Then("I click on Select button")
	public void i_click_on_Select_button() {
	   checkoutAddressPage.clickSelectBtn();
	   try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("I should land on Payment Details page")
	public void i_should_land_on_Payment_Details_page() {
		paymentDetailsPage.checkPaymentDetailsDisplayed();
	}

	@Then("I enter the card number as {string}")
	public void i_enter_the_card_number_as(String cardNum) {
	    paymentDetailsPage.enterCardNumber(cardNum);
	}

	@Then("I enter Expiry Date as {string} and {string}")
	public void i_enter_Expiry_Date_as_and(String month, String year) {
	    paymentDetailsPage.enterExpiryMonth(month);
	    paymentDetailsPage.enterExpiryYear(year);
	}

	@Then("I enter CV Code as {string}")
	public void i_enter_CV_Code_as(String code) {
	    paymentDetailsPage.enterCvCode(code);
	}

	@Then("I click on Pay button")
	public void i_click_on_Pay_button() {
	    paymentDetailsPage.pay();
	    try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("I land on the Order Confirmation page")
	public void i_land_on_the_Order_Confirmation_page() {
		orderSummaryPage.checkOrderConfirmed();
	}

}

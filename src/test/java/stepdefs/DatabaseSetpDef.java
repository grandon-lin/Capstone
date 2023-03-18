package stepdefs;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.DBUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductManagementPage;

public class DatabaseSetpDef {

	WebDriver driver = Hooks.driver;
	LoginPage loginPage;
	HomePage homePage;
	ProductManagementPage productManagementPage;
	String categoryName = "";
	String categoryDescription = "";
	
	public DatabaseSetpDef() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		productManagementPage = new ProductManagementPage(driver);
		Hooks.testName = "Database Test";
	}
	
	@Given("I login as an admin")
	public void i_login_as_an_admin() {
		driver.get("http://localhost:8090/medicare/login");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	    loginPage.enterUsername("vk@gmail.com");
	    loginPage.enterPassword("admin");
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

	@When("I click on Manage Product")
	public void i_click_on_Manage_Product() {
	    homePage.selectManageProduct();
	}

	@Then("I should land on Product Management page")
	public void i_should_land_on_Product_Management_page() {
		productManagementPage.isDisplayed();
		try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("I click on Add New Category button")
	public void i_click_on_Add_New_Category_button() {
	    productManagementPage.selectAddNewCategory();
	    try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("I should see New Category dialog displayed")
	public void i_should_see_New_Category_dialog_displayed() {
	    productManagementPage.newCategoryDialogDisplayed();
	}

	@Then("I enter Name as {string}")
	public void i_enter_Name_as(String name) {
		productManagementPage.enterName(name);
		categoryName = name;
		Hooks.categoryName = name;
	}

	@Then("I enter Description as {string}")
	public void i_enter_Description_as(String description) {
		productManagementPage.enterDescription(description);
		categoryDescription = description;
	}

	@Then("I click Save button")
	public void i_click_Save_button() {
	    productManagementPage.saveNewCategory();
	    try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("I verify the new category is added to the database")
	public void i_verify_the_new_category_is_added_to_the_database() throws ClassNotFoundException, SQLException {
		DBUtils dbutils = new DBUtils();
		String catDesc = dbutils.getCategoryDescription(categoryName);
		Assert.assertEquals(catDesc, categoryDescription);
	}
}

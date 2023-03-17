package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id = "username")
	WebElement email;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Login']")
	WebElement loginBtn;
	
	@FindBy(id = "userModel")
	WebElement userModel;
	
	public LoginPage(WebDriver baseDriver) {
		driver = baseDriver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	public void enterUsername(String usernameVal) {
		email.sendKeys(usernameVal);
	}
	
	public void enterPassword(String passwordVal) {
		password.sendKeys(passwordVal);
	}
	
	public void login() {
		loginBtn.click();
	}
	
	public void verifyLogin() {
		Assert.assertTrue(userModel.isDisplayed());
	}
	
	public void manageProductIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.id("manageProduct")).isDisplayed());
	}
	
	public void manageProductIsNotDisplayed() {
		Assert.assertTrue(driver.findElements(By.id("manageProduct")).isEmpty());
	}
	
	public void isLoginPageDisplayed() {
		Assert.assertTrue(loginBtn.isDisplayed());
	}
}

package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignupPage {
	
	WebDriver driver;
	public String emailValue = "";
	public String passwordValue = "";
	
	@FindBy(id = "firstName")
	WebElement firstname;
	
	@FindBy(id = "lastName")
	WebElement lastname;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "contactNumber")
	WebElement contactNumber;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id = "role1")
	WebElement userRadio;
	
	@FindBy(id = "role2")
	WebElement supplierRadio;
	
	@FindBy(xpath = "//button[@type='submit' and @name = '_eventId_billing']")
	WebElement nextBillingBtn;
	
	@FindBy(xpath = "//div[@class='content']//h4")
	WebElement personalHeader;
	
	@FindBy(id = "addressLineOne")
	WebElement addLineOne;
	
	@FindBy(id = "addressLineTwo")
	WebElement addLineTwo;
	
	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(id = "postalCode")
	WebElement postalCode;
	
	@FindBy(id = "state")
	WebElement state;
	
	@FindBy(id = "country")
	WebElement country;
	
	@FindBy(xpath = "//button[@type='submit' and @name = '_eventId_personal']")
	WebElement backPersonalBtn;
	
	@FindBy(xpath = "//button[@type='submit' and @name = '_eventId_confirm']")
	WebElement nextConfirmBtn;
	
	@FindBy(xpath = "//div[@class='content']/div/div[1]/div[1]//h4")
	WebElement personalDetailHeader;
	
	@FindBy(xpath = "//div[@class='content']/div/div[1]/div[2]//h4")
	WebElement billingAddressHeader;
	
	@FindBy(xpath = "//a[text() = 'Confirm']")
	WebElement confirmBtn;
	
	@FindBy(xpath = "//a[text() = 'Login Here']")
	WebElement loginHereBtn;
	
	public SignupPage(WebDriver baseDriver) {
		driver = baseDriver;
		PageFactory.initElements(baseDriver, this);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	public void fillPersonalDataAsUser(String firstnameVal, String lastnameVal, String emailVal, String contactNumberVal, String passwordVal, String confirmPasswordVal) {
		firstname.sendKeys(firstnameVal);
		lastname.sendKeys(lastnameVal);
		email.sendKeys(emailVal);
		emailValue = emailVal;
		contactNumber.sendKeys(contactNumberVal);
		password.sendKeys(passwordVal);
		passwordValue = passwordVal;
		confirmPassword.sendKeys(confirmPasswordVal);
		userRadio.click();
	}
	
	public void fillPersonalDataAsAdmin(String firstnameVal, String lastnameVal, String emailVal, String contactNumberVal, String passwordVal, String confirmPasswordVal) {
		firstname.sendKeys(firstnameVal);
		lastname.sendKeys(lastnameVal);
		email.sendKeys(emailVal);
		emailValue = emailVal;
		contactNumber.sendKeys(contactNumberVal);
		password.sendKeys(passwordVal);
		passwordValue = passwordVal;
		confirmPassword.sendKeys(confirmPasswordVal);
		supplierRadio.click();
	}
	
	public void clickNextBilling() {
		nextBillingBtn.click();
	}
	
	public void isSignUpPersonal() {
		try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		Assert.assertTrue(backPersonalBtn.isDisplayed());
		Assert.assertTrue(nextConfirmBtn.isDisplayed());
	}
	
	public void fillAddressData(String addLineOneVal, String addLineTwoVal, String cityVal, String postalCodeVal, String stateVal, String countryVal) {
		addLineOne.sendKeys(addLineOneVal);
		addLineTwo.sendKeys(addLineTwoVal);
		city.sendKeys(cityVal);
		postalCode.sendKeys(postalCodeVal);
		state.sendKeys(stateVal);
		country.sendKeys(countryVal);
	}
	
	public void clickBackPersonal() {
		backPersonalBtn.click();
	}
	
	public void clickNextConfirm() {
		nextConfirmBtn.click();
	}
	
	public void isConfirmDisplayed() {
		Assert.assertEquals(personalDetailHeader.getText(), "Personal Details");
		Assert.assertEquals(billingAddressHeader.getText(), "Billing Address");
		try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void clickConfirm() {
		confirmBtn.click();
	}
	
	public void isWelcomeDisplayed() {
		Assert.assertTrue(loginHereBtn.isDisplayed());
		try 
		{
			Thread.sleep(2000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void clickLoginHere() {
		loginHereBtn.click();
	}
}

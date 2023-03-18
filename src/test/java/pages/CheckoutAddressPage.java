package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutAddressPage {

	WebDriver driver;	
	
	@FindBy(xpath = "//div[@class='content']/div/div/div[1]/h4")
	WebElement selectAddressHeader;
	
	@FindBy(xpath = "//a[text()='Select']")
	WebElement selectBtn;
	
	public CheckoutAddressPage(WebDriver baseDriver) {
		driver = baseDriver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	public void checkSelectAddressDisplayed() {
		Assert.assertEquals(selectAddressHeader.getText(), "Select Shipping Address");
	}
	
	public void clickSelectBtn() {
		selectBtn.click();
	}
}

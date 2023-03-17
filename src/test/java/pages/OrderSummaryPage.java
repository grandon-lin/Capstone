package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrderSummaryPage {

	WebDriver driver;
	
	@FindBy(xpath = "//h3[@class='text-center']")
	WebElement confirmText;
	
	public OrderSummaryPage(WebDriver baseDriver) {
		driver = baseDriver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	public void checkOrderConfirmed() {
		Assert.assertEquals(confirmText.getText(), "Your Order is Confirmed!!");
	}
}

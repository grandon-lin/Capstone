package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetailsPage {

	WebDriver driver;
	
	@FindBy(xpath = "//h3[contains(text(), 'Payment Details')]")
	WebElement paymentDetailsHeader;
	
	@FindBy(id = "cardNumber")
	WebElement cardNumber;
	
	@FindBy(id = "expityMonth")
	WebElement expiryDateMonth;
	
	@FindBy(id = "expityYear")
	WebElement expiryDateYear;
	
	@FindBy(id = "cvCode")
	WebElement cvCode;
	
	@FindBy(xpath = "//a[text()='Pay']")
	WebElement payBtn;
	
	public PaymentDetailsPage(WebDriver baseDriver) {
		driver = baseDriver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	public void checkPaymentDetailsDisplayed() {
		Assert.assertTrue(paymentDetailsHeader.isDisplayed());
	}
	
	public void enterCardNumber(String cardNumberVal) {
		cardNumber.sendKeys(cardNumberVal);
	}
	
	public void enterExpiryMonth(String month) {
		expiryDateMonth.sendKeys(month);
	}
	
	public void enterExpiryYear(String year) {
		expiryDateYear.sendKeys(year);
	}
	
	public void enterCvCode(String code) {
		cvCode.sendKeys(code);
	}
	
	public void pay() {
		payBtn.click();
	}
}

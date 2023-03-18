package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='content']/div/div[2]/div[2]/h3")
	WebElement productTitle;
	
	@FindBy(xpath = "//a[@class='btn btn-success']")
	WebElement addToCartBtn;
	
	public ProductPage(WebDriver baseDriver) {
		driver = baseDriver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	public void checkCorrectProductDisplayed(String product) {
		Assert.assertTrue(addToCartBtn.isDisplayed());
	}
	
	public void addToCart() {
		addToCartBtn.click();
	}
}

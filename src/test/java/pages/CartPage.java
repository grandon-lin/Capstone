package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage {

	WebDriver driver;	
	
	@FindBy(xpath = "//tbody//td[@data-th='Product']//h4")
	WebElement productTitle;
	
	@FindBy(xpath = "//tfoot//a[@class='btn btn-success btn-block']")
	WebElement checkoutBtn;
	
	public CartPage(WebDriver baseDriver) {
		driver = baseDriver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	public void checkCartPageDisplaysProduct(String product) {
		Assert.assertEquals(productTitle.getText(), product);
	}
	
	public void checkout() {
		checkoutBtn.click();
	}
}

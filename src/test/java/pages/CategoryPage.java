package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class CategoryPage {

	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='list-group']/a[@class='list-group-item active']")
	WebElement highlightedCategory;
	
	public CategoryPage(WebDriver baseDriver) {
		driver = baseDriver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	public void checkProperCategoryDisplayed(String category) {
		Assert.assertEquals(highlightedCategory.getText(), category);
	}
	
	public void selectViewProductButtonForProduct(String product) {
		List<WebElement> list = driver.findElements(By.xpath("//tbody/tr"));
		for(int i = 1; i <= list.size(); i++) {
			String productName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
			if (productName.equals(product))
			{
				driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[6]/a")).click();
				break;
			}
		}
	}
}

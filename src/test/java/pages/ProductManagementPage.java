package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductManagementPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//button[text()='Add New Category']")
	WebElement addNewCategoryBtn;
	
	@FindBy(xpath = "//h4[text()='Product Management']")
	WebElement productManagementHeader;
	
	@FindBy(id = "myModalLabel")
	WebElement newCategoryHeader;
	
	@FindBy(xpath = "//form[@id=\"categoryForm\"]//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath = "//form[@id=\"categoryForm\"]//textarea[@id='description']")
	WebElement description;
	
	@FindBy(xpath = "//form[@id=\"categoryForm\"]//input[@value='Save']")
	WebElement saveBtn;
	
	public ProductManagementPage(WebDriver baseDriver) {
		driver = baseDriver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	public void isDisplayed() {
		Assert.assertTrue(productManagementHeader.isDisplayed());
	}
	
	public void selectAddNewCategory() {
		addNewCategoryBtn.click();
	}
	
	public void newCategoryDialogDisplayed() {
		Assert.assertTrue(newCategoryHeader.isDisplayed());
	}
	
	public void enterName(String nameVal) {
		name.sendKeys(nameVal);
	}
	
	public void enterDescription(String descVal) {
		description.sendKeys(descVal);
	}
	
	public void saveNewCategory() {
		saveBtn.click();
	}
}

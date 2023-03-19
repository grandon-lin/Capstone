package stepdefs;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.DBUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	public static String categoryName = null;
	public static int counter = 0;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		report = new ExtentReports("ExtentReport" + counter + ".html");
		counter++;
		test = report.startTest("Test" + counter);
		test.log(LogStatus.INFO, "Test " + counter + " Starting...........");
	}
	
	@After
	public void TearDown() throws ClassNotFoundException, SQLException {
		cleanup();
		report.flush();
		report.close();
	}
	
	private void cleanup() throws ClassNotFoundException, SQLException {
		DBUtils dbutils = new DBUtils();

		if(categoryName != null) {
			dbutils.removeCategory(categoryName);
			categoryName = null;
		}
		report.endTest(test);
		driver.close();
	}
}

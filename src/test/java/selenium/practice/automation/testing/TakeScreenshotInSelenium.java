package selenium.practice.automation.testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.ReadProperty;

	public class TakeScreenshotInSelenium {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get(ReadProperty.readProperty("url"));
	}
	
	@Test
	public void verifyTableData() throws IOException {
		
		utility.CommonUtils.takescreenshot(driver, "verifyTableData");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
package selenium.practice.automation.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.ReadProperty;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsInTestNg {
		
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
//		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get(ReadProperty.readProperty("url"));
	}
	
	@Test
	public void verifyHomepageUrl() {
		
		SoftAssert softAssert = new SoftAssert();
		
		String Url = driver.getCurrentUrl();
		String ExpectedUrl = "https://omayo.blogspot.com/";
		
		softAssert.assertEquals(Url, ExpectedUrl);
		
		softAssert.assertNotEquals(Url, "https://www.flipkart.com/");
		
		softAssert.assertEquals(Url, ExpectedUrl, "Url is Not Matched");
		
		softAssert.assertNotEquals(Url, "https://www.google.com/", "Url is matched with Google Url");
		
		WebElement Orangecheckbox = driver.findElement(By.cssSelector("input#checkbox1"));
		WebElement Bluecheckbox = driver.findElement(By.cssSelector("input#checkbox2"));
		
		softAssert.assertTrue(Orangecheckbox.isSelected());
		
		softAssert.assertFalse(Bluecheckbox.isSelected());
		
		softAssert.assertTrue(Orangecheckbox.isSelected(), "Orange checkbox is not checked");
		
		softAssert.assertFalse(Bluecheckbox.isSelected(), "Blue checkbox is checked");
		
		softAssert.assertAll();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
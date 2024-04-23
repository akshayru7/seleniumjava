package selenium.practice.automation.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;
import utility.ReadProperty;

public class HardAssertion {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get(ReadProperty.readProperty("url"));
	}
	
	@Test
	public void verifyHomePageUrl() {
		
		String url = driver.getCurrentUrl();
		String expectedUrl = "https://omayo.blogspot.com/";
		
		Assert.assertEquals(url, expectedUrl);
		
		Assert.assertNotEquals(url, "https://flipkart.com/");
		
		driver.navigate().to("https://flipkart.com/");
		
		WebElement flipkartloginbtn = driver.findElement(By.xpath("//span[text()='Login']"));
		
		System.out.println(flipkartloginbtn.getText());
		
		Assert.assertTrue(flipkartloginbtn.isDisplayed());
		
		Assert.assertTrue(flipkartloginbtn.isDisplayed(), "login button is not displayed");
		
		driver.navigate().back();
		
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='radio1']"));
		
		System.out.println(radiobtn.getTagName());
		
		Assert.assertFalse(radiobtn.isSelected());
		
		Assert.assertFalse(radiobtn.isSelected(), "radio button is selected");
		
		Assert.assertNotEquals(url, "https://www.google.com/");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
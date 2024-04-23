package selenium.practice.automation.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ReadProperty;

public class DataDrivenTesting {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(ReadProperty.readProperty("newtourhomepageurl"));
	}
	
	@Test(description = "Verify valid user login", groups = {"smoke"}, dataProvider = "users")
	public void verifyvalidLogin(String username, String password) {
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		webDriverWait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.xpath("//h3[text()='Login Successfully']"))));
		
		Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText(), 
				"Login Successfully", "User not logged in succefully");
	}
	
	@DataProvider(name = "users")
	public Object[][] dataProvider() {
		
		Object userData [][]= {{"admin", "password"}, {"user","user"},{"User1","password"}};
		
		return userData;
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
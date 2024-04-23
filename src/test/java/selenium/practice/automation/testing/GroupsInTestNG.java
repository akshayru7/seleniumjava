package selenium.practice.automation.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.ReadProperty;

public class GroupsInTestNG {
	
	WebDriver driver;
	
	@BeforeMethod (alwaysRun = true)
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get(ReadProperty.readProperty("flipkarturl"));
	}
	
	@Test(description = "Verify Flipkart URL launched", groups = {"smoke"})
	public void VerifyHomepageUrl() {
		
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.flipkart.com/"), "Home page url is incorrect");
	}
	
	@Test(description = "Verify specified text is display", groups = {"sanity"})
	public void verifyDisplaytext() {
		
		WebElement bestoflectronicstext = driver.findElement(By.xpath("//div[contains(text(),'Best of Electronics')]"));
		System.out.println(bestoflectronicstext.getText());
		Assert.assertTrue(bestoflectronicstext.isDisplayed(), "Best of Electronics is not displayed");
	}
	
	@Test(description = "Verify valid username", groups = {"Regression", "sanity"})
	public void Verifyvalidusername() {
		
		WebElement loginbtn = driver.findElement(By.xpath("//span[text()='Login']"));
		System.out.println(loginbtn.getTagName());
		
//		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		webDriverWait.until(ExpectedConditions.visibilityOf
//				(driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"))));
		loginbtn.click();
		WebElement emailtextbox = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		emailtextbox.sendKeys("Admin");
		Assert.assertTrue(emailtextbox.isDisplayed());
	}
	
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		driver.quit();
	}
}
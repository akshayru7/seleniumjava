package selenium.practice.automation.testing;

import java.time.Duration;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.ReadProperty;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTabularData {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup () {
		
//		WebDriverManager.chromedriver().setup();
		
//		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get(ReadProperty.readProperty("url"));
	}
	
	@Test(priority = 7)
	public void verifyTabulerData() {
		List<String> expectedData = Arrays.asList("Kishore", "22", "Delhi", "Manish", "25", "Pune", "Praveen",
				"29","Bangalore", "Dheepthi", "31", "Mumbai");
		
		List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']//tr//td"));
		List<String> actualData = new LinkedList<>();
		
		for(WebElement SepData : tableData ) {
			actualData.add(SepData.getText());
		}
		Assert.assertEquals(expectedData, actualData);
	}
	
	@Test(enabled = true, priority = 2)
	public void verifyUrl() {
		
		String Url =driver.getCurrentUrl();
		
		Assert.assertEquals(Url, "https://omayo.blogspot.com/");
	}
	
	@Test(priority = -5)
	public void verifyTitle() {
	
		String Title = driver.getTitle();
		
		Assert.assertEquals(Title, "omayo (QAFox.com)");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
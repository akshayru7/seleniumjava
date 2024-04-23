package selenium.practice.automation.testing;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.CommonUtils;
//import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadExcel;
import utility.ReadProperty;

public class ExcelReadingScenario {
	
	public static void main(String args[]) throws InvalidFormatException, IOException {
		
//		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get(ReadProperty.readProperty("newtour"));
		
		List<String> userData = ReadExcel.readExcel("src/test/resources/registrationdata.xlsx", "registrationdata");
		
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(userData.get(0));
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(userData.get(1));
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys(userData.get(2));
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(userData.get(3));
		
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys(userData.get(4));
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys(userData.get(5));
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys(userData.get(6));
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys(userData.get(7));
		
		WebElement countryDropdown = driver.findElement(By.cssSelector("select[name='country']"));
		CommonUtils.selectvalueFromDropDown(countryDropdown, "INDIA");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys(userData.get(8));
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(userData.get(9));
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys(userData.get(10));
		driver.findElement(By.cssSelector("input[name='submit']")).click();
	}
}
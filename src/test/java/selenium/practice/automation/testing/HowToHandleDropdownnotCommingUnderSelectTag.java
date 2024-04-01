package selenium.practice.automation.testing;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleDropdownnotCommingUnderSelectTag {
	
	static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://www.airvistara.com");
		
		HowToHandleDropdownnotCommingUnderSelectTag.selectCountry("UK");
		HowToHandleDropdownnotCommingUnderSelectTag.selectCountry("Singapore");
	}
	
	public static void selectCountry(String countryname) {
		
		driver.findElement(By.xpath("//img[contains(@src,'arrow-purple')]")).click();
		List<WebElement> countries = driver
				.findElements(By.xpath("//div//ul//li//span[@class=\"country-name\"]"));
		
		for ( WebElement country : countries) {
			if(country.getText().equalsIgnoreCase(countryname)) {
				country.click();
				break;
			}
		}
	}
}
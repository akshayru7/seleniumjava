package selenium.practice.automation.testing;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropdowncommingUnderSelectTag {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com");
		
		WebElement multiSelectDropdown = driver.findElement(By.cssSelector("#multiselect1"));
		
		Select select = new Select(multiSelectDropdown);
		
		List<WebElement> allselectedoption = select.getAllSelectedOptions();
		for ( WebElement option : allselectedoption) {
			System.out.println(option.getText());
		}
		
		List<WebElement> alloptionsfromDropdown = select.getOptions();
		System.out.println(alloptionsfromDropdown.size());
		
		for ( WebElement options : alloptionsfromDropdown) {
			System.out.println(options.getText());
		}
		
		System.out.println(select.isMultiple());
		
		select.selectByIndex(2);
		select.selectByValue("swiftx");
		select.selectByVisibleText("Audi");
		
		select.deselectByIndex(1);
		select.deselectByValue("audix");
		select.deselectByVisibleText("Hyundai");
	}
}
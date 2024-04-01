package selenium.practice.automation.testing;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelectDropdownCommingUnderSelectTag {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com");
		
		WebElement singleselectDropdown = driver.findElement(By.xpath("//select[@id='drop1']"));
		Select select = new Select(singleselectDropdown);
		
		List<WebElement> allselectedoptionsfromDropdown = select.getAllSelectedOptions();
		
		for (WebElement alloption : allselectedoptionsfromDropdown) {
			System.out.println(alloption.getText());
		}
		
		WebElement firstSelectedOption= select.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		//select.deselectAll();
		//select.deselectByIndex(0);
		//select.deselectByValue(null);
		//select.deselectByVisibleText(null);
		
		List<WebElement> AlloptionfromDropdown = select.getOptions();	
		System.out.println(AlloptionfromDropdown.size());
		
		for ( WebElement option : AlloptionfromDropdown) {
			System.out.println(option.getText());
		}
		
		//System.out.println(select.getWrappedElement());
	
		System.out.println(select.isMultiple());
		
		select.selectByIndex(2);
		select.selectByValue("jkl");
		select.selectByVisibleText("doc 1");
	}
}
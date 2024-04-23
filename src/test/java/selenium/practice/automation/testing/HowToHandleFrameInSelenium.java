package selenium.practice.automation.testing;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleFrameInSelenium {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.get("https://omayo.blogspot.com");
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("navbar-iframe");
		
		WebElement searchframe = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		driver.switchTo().frame(searchframe);
		driver.findElement(By.xpath("//input[@id='b-query']")).sendKeys("Automation Testing send text");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Testing");
	}
}
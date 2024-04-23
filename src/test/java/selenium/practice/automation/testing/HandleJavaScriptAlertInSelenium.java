package selenium.practice.automation.testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJavaScriptAlertInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com");
		
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.accept();
		alert.dismiss();
		
		driver.findElement(By.cssSelector("input[name='textboxn']")).sendKeys("Testing");
		
	}
}
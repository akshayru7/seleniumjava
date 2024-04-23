package selenium.practice.automation.testing;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com");
		
		//driver.findElement(By.xpath("//input[@size]")).sendKeys("Test");
		
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		
		javascriptExecutor.executeScript("window.scrollBy(0,700)", "");
		
		javascriptExecutor.executeScript("window.scrollBy(50,300)", "");
		
		javascriptExecutor.executeScript("window.scrollBy(-50,-700)", "");
		
		javascriptExecutor.executeScript("window.scrollBy(70,document.body.scrollHeight)");
		
		WebElement search = driver.findElement(By.xpath("//input[@size]"));
		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", search);
		
		WebElement carradiobtn = driver.findElement(By.xpath("//input[@value='Car']"));
		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", carradiobtn);
		
		//Thread.sleep(2000);
		javascriptExecutor.executeScript("arguments[0].click();", carradiobtn);
		
		javascriptExecutor.executeScript("window.scrollBy(document.body.scrollWidth,-200)");
	}
}
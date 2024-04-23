package selenium.practice.automation.testing;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleMultipleWindowsInSelenium {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com");
		
		driver.findElement(By.xpath("//a[@target='_blank' and @id='link2']")).click();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		for (String handle : windowhandles) {
			if(handle.equals(parentwindow)) {
				continue;
			} else {
				driver.switchTo().window(handle);
				break;
			}
		}
		
		System.out.println(driver.findElement(By.xpath("//a[contains(@href,'19-what')] ")).getText());
		
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.cssSelector("#alert1")).click();
		
		driver.switchTo().alert().accept();
		
		//parentwindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
		windowhandles = driver.getWindowHandles();
		
		for (String handle : windowhandles) {
			if(!(handle.equals(parentwindow))) {
				driver.switchTo().window(handle);
			}
		}
		
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
	}
}
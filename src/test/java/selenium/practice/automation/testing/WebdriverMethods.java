package selenium.practice.automation.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		//driver.close();
		
		//WebElement list = driver.findElement(By.xpath("//div[@aria-label='Home & Furniture']"));
		
		//list.click();
		
		//driver.close();
		
		WebElement list1 = driver.findElement(By.xpath("//div[contains(text(),'Top Mirror')]"));
		
		list1.click();
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.com");
		
		//driver.close();
		//driver.quit();
		
		System.out.println("Current URL : " + driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		System.out.println("      ");
		System.out.println(driver.getTitle());
		
		String windowhandles = driver.getWindowHandle();
		System.out.println(windowhandles);
		
		Set<String> windowhandles1 = driver.getWindowHandles();
		
		for (String sa : windowhandles1) {
			System.out.println(sa);
		}
		
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		Thread.sleep(1000);
		driver.navigate().to("https://www.youtube.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();
	}		
}
package selenium.practice.automation.testing;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedActionsByUsingActionsClassInSelenium {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com");
		
		Actions actions = new Actions(driver);
		
		//actions.click().build().perform();
		
		//actions.click(driver.findElement(By.xpath("//span[text()='Blogs']"))).build().perform();
		
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Blogs']"))).build().perform();
		
		//actions.contextClick().build().perform();
		
		//actions.doubleClick().build().perform();
		
		WebElement textarea1 = driver.findElement(By.xpath("//textarea[@cols='30']"));
		WebElement textarea2 = driver.findElement(By.xpath("//textarea[@cols='80']"));
		actions.click(textarea1).keyDown(Keys.CONTROL).keyDown("a").keyUp(Keys.CONTROL).keyUp("a").keyDown(Keys.CONTROL)
			.keyDown("x").keyUp(Keys.CONTROL).keyUp("x").click(textarea2).keyDown(Keys.CONTROL).keyDown("V")
			.keyUp(Keys.CONTROL).keyUp("v").keyDown(Keys.TAB).keyUp(Keys.TAB).keyUp(Keys.UP).build().perform();
		
		driver.navigate().to("https://www.flipkart.com");
		
		//actions.click(driver.findElement(By.xpath("//span[text()='Login']"))).build().perform();
		
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Login']"))).build().perform();
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
//		actions.dragAndDrop(driver.findElement(By.xpath("//li[@id='fourth']/a")),
//				driver.findElement(By.xpath("//ol[@id='amt7']/li"))).build().perform();
		
		actions.clickAndHold(driver.findElement(By.xpath("//li[@id='fourth']/a")))
				.moveToElement(driver.findElement(By.xpath("//ol[@id='amt7']/li"))).release().build().perform();
	}
}
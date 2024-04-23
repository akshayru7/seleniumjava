package selenium.practice.automation.testing;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitInSelenium {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://omayo.blogspot.com");
		
		driver.get("https://www.flipkart.com");
		
		//driver.findElement(By.xpath("//a[@href='dg']"));
		
		driver.navigate().back();
			
//		String str = driver.findElement(By.cssSelector("#delayedText")).getAttribute("innerHTML");
//		System.out.println(str);
		
		WebElement webElement = driver.findElement(By.cssSelector("#delayedText"));
		
		System.out.println(webElement.getAttribute("innerHTML"));
		
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
		
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView()", webElement);
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		WebElement mybtn = driver.findElement(By.xpath("//button[@id='myBtn']"));
		
		System.out.println("Attribute Value = " + mybtn.getAttribute("disabled"));
		System.out.println("My Button is = " + mybtn.isEnabled());
		
		webDriverWait.until(ExpectedConditions.attributeToBe(mybtn, "disabled", "true"));
		
		System.out.println("My Button is = " + mybtn.isEnabled());
		
		WebElement timerbtn = driver.findElement(By.cssSelector("#timerButton"));
		
//		System.out.println("Timer Button is = " + timerbtn.isEnabled());
//		it was show my button already is enabled in above print line.
		
		webDriverWait.until(ExpectedConditions.elementToBeClickable(timerbtn));
		
		System.out.println("Timer Button is = " + timerbtn.isEnabled());
		
		webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
		
		System.out.println(webElement.isDisplayed());
		
		driver.navigate().refresh();
		
		mybtn = driver.findElement(By.xpath("//button[@id='myBtn']"));
		
		System.out.println("My Button is = " + mybtn.isEnabled());
		
		WebElement Checkthisbtn = driver.findElement(By.xpath("//button[text()='Check this']"));
		
		Checkthisbtn.click();
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='dte']"));
		
		System.out.println("Check Box is = " + checkbox.isEnabled());
		
		webDriverWait.until(ExpectedConditions.elementToBeClickable(checkbox));
		
		System.out.println("Check Box is = " + checkbox.isEnabled());
	}
}
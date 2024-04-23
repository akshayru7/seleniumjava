package selenium.practice.automation.testing;

import java.time.Duration;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//import org.testng.annotations.Test;

import utility.ReadProperty;

public class FluentWaitInSelenium {

	//@Test
	
	public static void main(String[] args) {
		
//		WebDriverManager.ChromeDriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(ReadProperty.readProperty("url"));
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(10))
				.ignoring(TimeoutException.class);
		
		WebElement displayedText = driver.findElement(By.cssSelector("#delayedText"));
		
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
		
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView()", displayedText);
		
		fluentWait.until(ExpectedConditions.visibilityOf(displayedText));
		
		System.out.println(displayedText.isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		WebElement mybtn = driver.findElement(By.xpath("//button[@id='myBtn']"));
		
		System.out.println("Attribute Value = " + mybtn.getAttribute("disabled"));
		System.out.println("My Button is = " + mybtn.isEnabled());
		
		fluentWait.until(ExpectedConditions.attributeToBe(mybtn, "disabled", "true"));
		
		System.out.println("My Button is = " + mybtn.isEnabled());
		
		WebElement timerbtn = driver.findElement(By.cssSelector("#timerButton"));
		
//		System.out.println("Timer Button is = " + timerbtn.isEnabled());
//		it was show my button already is enabled in above print line.
		
		fluentWait.until(ExpectedConditions.elementToBeClickable(timerbtn));
		
		System.out.println("Timer Button is = " + timerbtn.isEnabled());
		
		driver.navigate().refresh();
		
		mybtn = driver.findElement(By.xpath("//button[@id='myBtn']"));
		
		System.out.println("My Button is = " + mybtn.isEnabled());
		
		WebElement Checkthisbtn = driver.findElement(By.xpath("//button[text()='Check this']"));
		
		Checkthisbtn.click();
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='dte']"));
		
		System.out.println("Check Box is = " + checkbox.isEnabled());
		
		fluentWait.until(ExpectedConditions.elementToBeClickable(checkbox));
		
		System.out.println("Check Box is = " + checkbox.isEnabled());
	}
}
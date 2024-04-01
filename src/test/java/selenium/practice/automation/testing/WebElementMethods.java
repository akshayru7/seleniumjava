package selenium.practice.automation.testing;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class WebElementMethods {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		WebElement SearchAnything = driver.findElement(By.xpath("//input[@type='text' and @title]"));
		
		SearchAnything.sendKeys("pen");
		
		SearchAnything.clear();
		
		System.out.println(SearchAnything.getAccessibleName());
		
		System.out.println(SearchAnything.getAriaRole());
		
		System.out.println(SearchAnything.getAttribute("name"));
		
		SearchAnything.click();
		
		System.out.println(SearchAnything.getCssValue("display"));
		
		Point p = SearchAnything.getLocation();
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		File file = SearchAnything.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File ("src/test/resources/screenshot/" + "test.png"));
		
		//System.out.println(SearchAnything.getShadowRoot());
		
		Dimension a = SearchAnything.getSize();
		System.out.println(a.getHeight());
		System.out.println(a.getWidth());
		
		System.out.println(SearchAnything.getTagName());
		
		System.out.println(SearchAnything.getText());
		
		System.out.println(SearchAnything.isDisplayed());
		
		System.out.println(SearchAnything.isEnabled());
		
		System.out.println(SearchAnything.isSelected());
		
		//SearchAnything.submit();
	}
}
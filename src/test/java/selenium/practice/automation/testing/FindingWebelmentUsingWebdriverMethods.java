package selenium.practice.automation.testing;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingWebelmentUsingWebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> li = driver.findElements(By.xpath("//button['login']"));
		
		for (WebElement wb : li ) {
			System.out.println(wb.getText());
		}
		
		System.out.println("            ");
		
		List<WebElement> li1 = driver.findElements(By.xpath("//button[@id or @type]/../..//.."));
		
		for (WebElement wb1 : li1 ) {
			System.out.println(wb1.getText());
		}
		
		System.out.println("            ");
		
		List<WebElement> li2 = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/header/div/div[2]"));
		
		for (WebElement wb2 : li2 ) {
			System.out.println(wb2.getText());
		}
		
		System.out.println("            ");
		
		WebElement ele = driver.findElement(By.id("radio2"));
		
		ele.click();
		
		Thread.sleep(2000);
		
		WebElement el = driver.findElement(By.name("gender"));
		el.click();
		
		WebElement classname = driver.findElement(By.className("title"));
		//System.out.println(classname.getText());
		String s = classname.getText();
		System.out.println(s);
		
		WebElement link = driver.findElement(By.linkText("http://www.Selenium143.blogspot.com"));
		link.click();
		
		WebElement list = driver.findElement(By.partialLinkText("p window"));
		list.click();
		
//		WebElement elt = driver.findElement(By.tagName("div"));
//		System.out.println(elt.getAttribute("href"));
	
		List<WebElement> elt = driver.findElements(By.tagName("a"));
		System.out.println("Number of links present on home page is : " + elt.size());
		for(WebElement el1 : elt) {
		System.out.println(el1.getAttribute("href"));
		}
		
		List<WebElement> button1 = driver.findElements(By.tagName("button"));
		Iterator<WebElement> it = button1.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next().getText());
		}
		System.out.println(" Number of Clickable Button : "+ button1.size());
		
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class]//header//div[@class]//div['header-cap-bottom cap-bottom']"));
		
		for (WebElement sss : ls) {
			System.out.println(sss.getText());
		}
		System.out.println("        ");
		
		List<WebElement> ls1 = driver.findElements(By.xpath("(//h1[normalize-space()])[2]"));
		
		for (WebElement s1 : ls1) {
			System.out.println(s1.getText());
		}
		System.out.println("        ");
		
		List<WebElement> ls2 = driver.findElements(By.xpath("//*[normalize-space()='omayo (QAFox.com)']"));
		
		for (WebElement s2 : ls2) {
			System.out.println(s2.getText());
		}
		System.out.println("        ");
		
		List<WebElement> wb = driver.findElements(By.xpath("//*[text()='Text Area Field Two']"));
		
		Iterator<WebElement> i = wb.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next().getText());
		}
		System.out.println("        ");
		
		List<WebElement> find = driver.findElements(By.xpath("//*[contains(text(), 'One')]"));
		
		for (WebElement finding : find) {
			System.out.println(finding.getText());
		}
		System.out.println("        ");
		
		List<WebElement> lf2 = driver.findElements(By.xpath("//a[starts-with(@href, 'https://om')]"));
		
		for (WebElement ss : lf2) {
			System.out.println(ss.getText());
		}
	}
}
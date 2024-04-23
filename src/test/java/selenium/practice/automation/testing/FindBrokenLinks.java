package selenium.practice.automation.testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.ReadProperty;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
//		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get(ReadProperty.readProperty("url"));
	}
	
	@Test
	public void cerifyBrokenLinks() throws IOException {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		List<String> linksAsString = new ArrayList<String>();
		
		for (WebElement link : links) {
			linksAsString.add(link.getAttribute("href"));
		}
		
		for (String link : linksAsString) {
			if(link != null) {
				if(link.startsWith("http")) {
					testLink(link);
				}
			}
		}
	}
	
	public void testLink(String ulr) throws IOException {
		
		URL url = new URL(ulr);
		
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		
		httpURLConnection.setConnectTimeout(5000);
		
		httpURLConnection.connect();
		
		if(httpURLConnection.getResponseCode()==200) {
			System.out.println(url + "is working fine and status msg is " + httpURLConnection.getResponseMessage());
		}
		
		if(httpURLConnection.getResponseCode()!=200) {
			System.out.println(url + "is not working fine and status msg is " + httpURLConnection.getResponseMessage());
		}
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
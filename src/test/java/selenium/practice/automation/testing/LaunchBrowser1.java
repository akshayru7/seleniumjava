package selenium.practice.automation.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser1 {

	public static void main(String[] args) {
		
		//WebDriver driver1 = new RemoteWebDriver();
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
	}

}

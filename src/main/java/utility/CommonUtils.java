package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils {
	
	public static void selectvalueFromDropDown(WebElement dropdownLocator, String optionToBeSelected) {
		
		Select select = new Select(dropdownLocator);
		select.selectByVisibleText(optionToBeSelected);
	}
	
	public static void takescreenshot(WebDriver driver, String name) throws IOException {
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("src/test/resources/screenshot/" + name + System.currentTimeMillis()+".png"));
	}

}

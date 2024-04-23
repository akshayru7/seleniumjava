package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	public static String readProperty(String key) {
		
		String value = null;
		try {
		File file = new File("src/test/resources/testdata.properties");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		Properties properties = new Properties();
		properties.load(fileInputStream);
		value = properties.getProperty(key);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			
		}
		return value;
	}
}
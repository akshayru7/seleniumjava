package selenium.practice.automation.testing;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\ECS\\Music\\NewFile\\Text.txt");
		
		if (!(file.exists())) {
		file.createNewFile();
		}
		
		System.out.println("File can Excecute = " + file.canExecute());
		
		System.out.println("File can Read = " + file.canRead());
		
		System.out.println("File can Write = " + file.canWrite());
		
		System.out.println("File compare to file path = " + file.compareTo(file));
		
//		System.out.println(file.delete());
		
//		file.deleteOnExit();
		
		System.out.println("File Equals file path = " + file.equals(file));
		
		System.out.println("File is Exist = " + file.exists());
		
		System.out.println("File = " + file.getAbsoluteFile());
		System.out.println("File path = " + file.getAbsolutePath());
		System.out.println("File path = " + file.getCanonicalPath());
		System.out.println("File path = " + file.getCanonicalPath());
		
		System.out.println("File FreeSapce = " + file.getFreeSpace());
		
		String name = "Mr. Thor";
		int number = 13;
		String n = "Hammer";
		int s = 14;
		
		System.out.println("Length of Name = " + name.length());
		
		FileWriter fileWriter = new FileWriter(file);
		
		fileWriter.append("Series " + "Marval ");
		fileWriter.append(n + " ");
		
		fileWriter.write(name);
		
		fileWriter.write(number);
		
		fileWriter.write(n);
		
		fileWriter.write(s);
		
		fileWriter.close();
		
		System.out.println(file.getFreeSpace());
		
		System.out.println("File Name = " + file.getName());
		
		System.out.println("Parent File Name = " + file.getParent());
		System.out.println("File path = " + file.getPath()); //get path same as getAbsolutepath
		System.out.println(file.getTotalSpace());
		System.out.println(file.getUsableSpace()); //file.getFreeSpace() get same result
		System.out.println(file.isAbsolute());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
		System.out.println(file.lastModified());
		System.out.println(file.toURI());
		
		FileReader fileReader = new FileReader(file);
		
		int i;
		while((i = fileReader.read())!=-1) {
			System.out.print((char)i);
		}
		fileReader.close();	
	}
}
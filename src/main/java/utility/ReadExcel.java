package utility;

import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static List<String> readExcel(String filePath, String sheetName) throws InvalidFormatException, IOException {
		
		File file = new File(filePath);
//		FileInputStream fileInputStream = new FileInputStream(file);
		
		List<String> userData = new ArrayList<String>();
		
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);
		
		XSSFSheet xssfSheet = xssfWorkbook.getSheet(sheetName);
		
		int lastRowNum = xssfSheet.getLastRowNum();
		
		for (int i=0; i<=lastRowNum; i++) {
			XSSFRow xssfRow = xssfSheet.getRow(i);
			
			int lastCellNum = xssfRow.getLastCellNum();
			for(int j=0; j<lastCellNum; j++) {
				userData.add(xssfRow.getCell(j).toString());
			}
		}
		xssfWorkbook.close();
		return userData;
	}
}
package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
public static String getTestdata(String Name, int row , int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\aajmi\\Desktop\\TestData.xlsx");
	String a = WorkbookFactory.create(file).getSheet(Name).
			getRow(row).getCell(cell).getStringCellValue();
	return a;
	
}
}

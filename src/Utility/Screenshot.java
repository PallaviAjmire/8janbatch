package Utility;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static String DateTime() {
		DateTimeFormatter Dt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		LocalDateTime obj= LocalDateTime.now();
		String d =Dt.format(obj);
		return d;
		}
	
public static void Screenshot(WebDriver driver, String name) throws IOException {
	String dt = Screenshot.DateTime();
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//String timeStamp = new SimpleDateFormat("YYYY_MM_dd_hh_mm_ss").format(new Date());
	File destination = new File("C:\\Users\\aajmi\\Documents\\ScreenShort\\"+ name +dt+".jpg");
 FileHandler.copy(source, destination);
}
}

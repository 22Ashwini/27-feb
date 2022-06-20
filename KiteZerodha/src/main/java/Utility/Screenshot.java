package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {

	public static void takescreenshot(WebDriver driver,String name) throws IOException  {
      String d = Screenshot.date();
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  
	File destination = new File("F:\\Screenshot\\"+name + d+".jpg");	
	
	FileHandler.copy(source,destination);//add throws ioexception
	}
	
	public static String date() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");// format a time date and time as required
		LocalDateTime curranttime =LocalDateTime.now();// return the currant time
		String date= dtf.format(curranttime);//format the time  given in my now() method to required format and return string
		return date;
	
//		String date =DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss").format(LocalDateTime.now());
//		return date;
	}
	
	
	
	
	
	
	
}




